/**
 * Creada por el equipo de de Aseguramiento de Ingresos de Nextel (12/03/2009)
 */



package clasesUtiles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.*;
import java.io.*;


public class CompresorZip implements Serializable{

        private int BUFFER_SIZE=1024;
        

    public void comprimir(String filename,List files){


           try
        {
        // Reference to the file we will be adding to the zipfile
        BufferedInputStream origin = null;
        // Reference to our zip file
        FileOutputStream dest = new FileOutputStream( filename );
        // Wrap our destination zipfile with a ZipOutputStream
        ZipOutputStream out = new ZipOutputStream( new BufferedOutputStream( dest ) );
        // Create a byte[] buffer that we will read data

        // from the source
        // files into and then transfer it to the zip file
        byte[] data = new byte[ BUFFER_SIZE ];
        // Iterate over all of the files in our list
                for( Iterator i=files.iterator(); i.hasNext();)
                {
        // Get a BufferedInputStream that we can use to read the

                    // source file
                    String file = ( String )i.next();
                    //System.out.println( "Adding: " + file);
                    File fin=new File(file);
                    FileInputStream fi = new FileInputStream(fin);
                    origin = new BufferedInputStream( fi, BUFFER_SIZE );
                    // Setup the entry in the zip file
                    ZipEntry entry = new ZipEntry(fin.getName());
                    out.putNextEntry( entry );
                    // Read data from the source file and write it out to the zip file
                    int count;
                            while( ( count = origin.read(data, 0, BUFFER_SIZE ) ) != -1 )
                            {
                                out.write(data, 0, count);
                            }
                        // Close the source file
                        origin.close();
                }
        // Close the zip file
            out.close();
            }
        catch( Exception e )
        {
        e.printStackTrace();
        }

    }


    public void descomprimir(String filename){

           try {
            // Create a ZipInputStream to read the zip file
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream( filename );
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream( fis ) );
            // Loop over all of the entries in the zip file
            int count;
            byte data[] = new byte[ BUFFER_SIZE ];

            ZipEntry entry;
                    while( ( entry = zis.getNextEntry() ) != null )
                    {
                    if( !entry.isDirectory() )
                        {
                        String entryName = entry.getName();
                        prepareFileDirectories( filename.substring(0,filename.indexOf(".")), entryName );
                        String destFN = filename.substring(0,filename.indexOf("."))+ File.separator + entry.getName();
                        //System.out.println(destFN);
                        // Write the file to the file system
                        FileOutputStream fos = new FileOutputStream( destFN );
                        dest = new BufferedOutputStream( fos, BUFFER_SIZE );
                            while( (count = zis.read( data, 0, BUFFER_SIZE ) ) != -1 )
                            {
                            dest.write( data, 0, count );
                            }
                        dest.flush();
                        dest.close();
                        }
                    }
                zis.close();
                }
            catch( Exception e )
            {
            e.printStackTrace();
            }
    }

//Nueva

public static String Unzip(String inFilePath) throws Exception
{
    GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream(inFilePath));
 
    String outFilePath = inFilePath.replace(".gz", "");
    OutputStream out = new FileOutputStream(outFilePath);
 
    byte[] buf = new byte[1024];
    int len;
    while ((len = gzipInputStream.read(buf)) > 0)
        out.write(buf, 0, len);
 
    gzipInputStream.close();
    out.close();
 
    new File(inFilePath).delete();
 
    return outFilePath;
}




public void prepareFileDirectories( String destination, String entryName ) throws IOException{

    File new_file=new File(destination);
       
        new_file.mkdir();


}

public static void main(String [] args) throws FileNotFoundException, IOException
    {

    CompresorZip cmp=new CompresorZip();

List <String> archivos=new ArrayList();
archivos.add("C:\\tmp\\Alerta_dig.PNG");
archivos.add("C:\\tmp\\distr.PNG");

cmp.comprimir("C:\\tmp\\014Evidencia.zip",archivos );      


    }
}