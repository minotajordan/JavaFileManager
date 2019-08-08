/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.imageio.ImageIO;

/**
 * La Clase FileManager proporciona los métodos necesarios para creación y
 * lectura de ficheros.
 *
 * @author Donaldo José Arteta Chagüi
 * @author Jordan Jesus Hurtado Minota
 * @version 0.0.9
 *
 */
public class FileManager {

    /**
     * Método para guardar un boolean en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, boolean obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeBoolean(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un int en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, int obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeInt(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un Object en un archivo de forma sincronizada un
     * Object debe ser un Objeto que implemente la clase Serializable
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSaveObject(String ruta, Object obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeObject(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un long en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, long obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeLong(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un float en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, float obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeFloat(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un double en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, double obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeDouble(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un byte en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, byte obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeByte(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un char en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, char obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeChar(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un short en un archivo de forma sincronizada
     *
     * @param ruta
     * @param obj
     */
    public static synchronized void synchroSave(String ruta, short obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeShort(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un String en un archivo binario codificación UTF de
     * forma sincronizada
     *
     * @param ruta
     * @param obj
     * @return devuelve true si se guarda con éxito
     */
    public static synchronized boolean synchroSaveStringUTF(String ruta, String obj) {
        boolean res = false;
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeUTF(obj);
            writer.close();
            salida.close();
            res = true;
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para guardar un String en un archivo binario codificación UTF de
     * forma sincronizada
     *
     * @param ruta
     * @param obj
     * @return devuelve true si se guarda con éxito
     */
    public static synchronized boolean synchroSaveAppendStringUTF(String ruta, String obj) {
        boolean res = false;
        String oldText = synchroLoadStringUTF(ruta);
        String newText = oldText.concat(obj);
        return res = synchroSaveStringUTF(ruta, newText);
    }

    /**
     * Método para guardar un String en un archivo de texto plano de forma
     * sincronizada
     *
     * @param ruta
     * @param text
     * @return devuelve true si se guarda con exito
     */
    public static synchronized boolean synchroSaveTextPlain(String ruta, String text) {
        boolean res = false;
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            PrintWriter writer;
            writer = new PrintWriter(salida, true);
            String[] toWrites = text.split("\n");
            for (String toWrite : toWrites) {
                writer.println(toWrite);
            }
            writer.close();
            salida.close();
            res = true;
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para añadir un String, a un archivo que ya contenia texto
     * anteriormente de forma sincronizada
     *
     * @param ruta
     * @param text
     * @return devuelve true si se guarda con exito.
     */
    public static synchronized boolean synchroSaveAppendTextPlain(String ruta, String text) {
        String oldText = synchroLoadTextPlain(ruta);
        if (oldText.endsWith("\n") == true) {
            oldText = oldText.substring(0, oldText.length() - 1);
        }
        String newText = oldText.concat(text);
        return synchroSaveTextPlain(ruta, newText);
    }

    /**
     * Método para cargar un int de un archivo de forma sincronizada
     *
     * @param ruta
     * @return int
     */
    public static synchronized int synchroLoadInt(String ruta) {
        int res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readInt();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un byte de un archivo de forma sincronizada
     *
     * @param ruta
     * @return byte
     */
    public static synchronized byte synchroLoadByte(String ruta) {
        byte res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readByte();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un char de un archivo de forma sincronizada
     *
     * @param ruta
     * @return char
     */
    public static synchronized char synchroLoadChar(String ruta) {
        char res = ' ';
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readChar();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un short de un archivo de forma sincronizada
     *
     * @param ruta
     * @return short
     */
    public static synchronized short synchroLoadShort(String ruta) {
        short res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readShort();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un long de un archivo de forma sincronizada
     *
     * @param ruta
     * @return
     */
    public static synchronized long synchroLoadLong(String ruta) {
        long res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readLong();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un float de un archivo de forma sincronizada
     *
     * @param ruta
     * @return
     */
    public static synchronized float synchroLoadFloat(String ruta) {
        float res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readFloat();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un double de un archivo de forma sincronizada
     *
     * @param ruta
     * @return
     */
    public static synchronized double synchroLoadDouble(String ruta) {
        double res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readDouble();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un String de un archivo binario UTF de forma
     * sincronizada
     *
     * @param ruta
     * @return StringUTF de archivo
     */
    public static synchronized String synchroLoadStringUTF(String ruta) {
        String res = null;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readUTF();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un boolean de un archivo de forma sincronizada
     *
     * @param ruta
     * @return
     */
    public static synchronized boolean synchroLoadBoolean(String ruta) {
        boolean res = false;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readBoolean();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un Object de un archivo de forma sincronizada un
     * Object debe ser un Objeto que implemente la clase Serializable
     *
     * @param ruta
     * @return
     */
    public static synchronized Object synchroLoadObject(String ruta) {
        Object res = null;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un String de un archivo de texto plano de forma
     * sincronizada
     *
     * @param ruta
     * @return
     */
    public static synchronized String synchroLoadTextPlain(String ruta) {
        String res = "";
        File archivo = new File(ruta);
        try {
            FileReader entrada;
            entrada = new FileReader(archivo);
            BufferedReader reader;
            reader = new BufferedReader(entrada);
            String leido;
            while ((leido = reader.readLine()) != null) {
                res = res.concat(leido + "\n");
            }
            res = res.substring(0, res.length() - 1);
            reader.close();
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método que sirve para copiar un archivo desde una ruta otra nueva ruta de
     * forma sincronizada
     *
     * @param rutaOriginal String de la ruta Original
     * @param rutaCopia String de la ruta Nueva
     * @return
     */
    public static synchronized boolean synchroCopyFile(String rutaOriginal, String rutaCopia) {
        boolean res = false;
        File archivoOriginal = new File(rutaOriginal);
        File archivoCopia = new File(rutaCopia);

        if (archivoOriginal.exists() == true) {
            FileInputStream entrada;
            FileOutputStream salida;
            try {
                entrada = new FileInputStream(archivoOriginal);
                salida = new FileOutputStream(archivoCopia);
                byte[] buffer = new byte[1024];
                int lon;
                while ((lon = entrada.read(buffer)) > 0) {
                    salida.write(buffer, 0, lon);
                }
                entrada.close();
                salida.close();
                res = true;
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
        return res;
    }

    /**
     * Método para guardar un archivo proveniente de un InputStrean de entrada
     * de forma sincronizada
     *
     * @param ruta ruta del archivo que se va a guardar
     * @param entrada ImputStream de entrada
     * @return
     */
    public static synchronized boolean synchroSaveFile(String ruta, InputStream entrada) {
        boolean res = false;
        File archivo = new File(ruta);
        if (archivo.exists() == false) {
            try {
                FileOutputStream salida;
                salida = new FileOutputStream(archivo);
                byte[] buffer = new byte[1024];
                int lon;
                while ((lon = entrada.read(buffer)) > 0) {
                    salida.write(buffer, 0, lon);
                }
                entrada.close();
                salida.close();
                res = true;
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
        return res;
    }

    /**
     * Método para guardar un archivo que se encuentra en una url de forma
     * sincronizada
     *
     * @param ruta ruta del archivo que se va a guardar
     * @param link dirección url del archivo que se quiere descargar
     * @return
     */
    public static synchronized boolean synchroDownloadFile(String ruta, String link) {
        boolean res = false;
        try {
            URL url = new URL(link);
            URLConnection urlCon = url.openConnection();
            res = saveFile(ruta, urlCon.getInputStream());
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método que se utiliza para eliminar un fichero o directorio
     *
     * @param ruta
     * @return devuelve true si se ha borrado con exito
     */
    public static synchronized boolean synchroRemoveFile(String ruta) {
        boolean res = false;
        File archivo = new File(ruta);
        if (archivo.exists() == true) {
            try {
                res = archivo.delete();
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return res;
    }

    /**
     * Método para guardar un boolean en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, boolean obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeBoolean(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un int en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, int obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeInt(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un Object en un archivo. un Object debe ser un Objeto
     * que implemente la clase Serializable
     *
     * @param ruta
     * @param obj
     */
    public static void saveObject(String ruta, Object obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeObject(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un long en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, long obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeLong(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un float en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, float obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeFloat(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un double en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, double obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeDouble(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un byte en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, byte obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeByte(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un char en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, char obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeChar(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un short en un archivo
     *
     * @param ruta
     * @param obj
     */
    public static void save(String ruta, short obj) {
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeShort(obj);
            writer.close();
            salida.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * Método para guardar un String en un archivo binario codificación UTF
     *
     * @param ruta
     * @param obj
     * @return devuelve true si se ha guardado correctamente
     */
    public static boolean saveStringUTF(String ruta, String obj) {
        boolean res = false;
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            ObjectOutputStream writer;
            writer = new ObjectOutputStream(salida);
            writer.writeUTF(obj);
            writer.close();
            salida.close();
            res = true;
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para guardar un String en un archivo binario codificación UTF
     *
     * @param ruta
     * @param obj
     * @return devuelve true si se ha guardado correctamente
     */
    public static boolean saveAppendStringUTF(String ruta, String obj) {
        String oldText = loadStringUTF(ruta);
        String newText = oldText.concat(obj);
        return saveStringUTF(ruta, newText);
    }

    /**
     * Método para guardar un String en un archivo de texto plano
     *
     * @param ruta
     * @param text
     * @return Devuelve true, si se guardó con exito
     */
    public static boolean saveTextPlain(String ruta, String text) {
        boolean res = false;
        File archivo = new File(ruta);
        try {
            FileOutputStream salida;
            salida = new FileOutputStream(archivo);
            PrintWriter writer;
            writer = new PrintWriter(salida, true);
            String[] toWrites = text.split("\n");
            for (String toWrite : toWrites) {
                writer.print(toWrite + "\n");
            }
            writer.close();
            salida.close();
            res = true;
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para añadir un String, a un archivo que ya contenia texto
     * anteriormente
     *
     * @param ruta
     * @param text
     * @return devuelve true si se guarda con exito.
     */
    public static boolean saveAppendTextPlain(String ruta, String text) {
        String oldText = loadTextPlain(ruta);
        if (oldText.endsWith("\n") == true) {
            oldText = oldText.substring(0, oldText.length() - 1);
        }
        String newText = oldText.concat(text);
        return saveTextPlain(ruta, newText);
    }

    /**
     * Método para cargar un int de un archivo
     *
     * @param ruta
     * @return int
     */
    public static int loadInt(String ruta) {
        int res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readInt();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un byte de un archivo
     *
     * @param ruta
     * @return byte
     */
    public static byte loadByte(String ruta) {
        byte res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readByte();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un char de un archivo
     *
     * @param ruta
     * @return char
     */
    public static char loadChar(String ruta) {
        char res = ' ';
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readChar();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un short de un archivo
     *
     * @param ruta
     * @return short
     */
    public static short loadShort(String ruta) {
        short res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readShort();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un long de un archivo
     *
     * @param ruta
     * @return
     */
    public static long loadLong(String ruta) {
        long res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readLong();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un float de un archivo
     *
     * @param ruta
     * @return
     */
    public static float loadFloat(String ruta) {
        float res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readFloat();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un double de un archivo
     *
     * @param ruta
     * @return
     */
    public static double loadDouble(String ruta) {
        double res = -1;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readDouble();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un String de un archivo binario UTF
     *
     * @param ruta
     * @return
     */
    public static String loadStringUTF(String ruta) {
        String res = null;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readUTF();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un boolean de un archivo
     *
     * @param ruta
     * @return
     */
    public static boolean loadBoolean(String ruta) {
        boolean res = false;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readBoolean();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un Object de un archivo un Object debe ser un Objeto
     * que implemente la clase Serializable
     *
     * @param ruta
     * @return
     */
    public static Object loadObject(String ruta) {
        Object res = null;
        File archivo = new File(ruta);
        try {
            FileInputStream entrada;
            entrada = new FileInputStream(archivo);
            ObjectInputStream reader;
            reader = new ObjectInputStream(entrada);
            res = reader.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método para cargar un String de un archivo de texto plano
     *
     * @param ruta
     * @return
     */
    public static String loadTextPlain(String ruta) {
        String res = "";
        File archivo = new File(ruta);
        try {
            FileReader entrada;
            entrada = new FileReader(archivo);
            BufferedReader reader;
            reader = new BufferedReader(entrada);
            String leido;
            while ((leido = reader.readLine()) != null) {
                res = res.concat(leido + "\n");
            }
            res = res.substring(0, res.length() - 1);
            reader.close();
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método que inicia un ObjectInputStream a la ruta especificada.
     *
     * @param ruta
     * @return
     */
    public static ObjectInputStream inputObjectStream(String ruta) {
        File archivo = new File(ruta);
        FileInputStream entrada;
        ObjectInputStream reader = null;
        try {
            entrada = new FileInputStream(archivo);
            reader = new ObjectInputStream(entrada);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return reader;
    }

    /**
     * Método que inicia un ObjectOutputStream a la ruta especificada.
     *
     * @param ruta
     * @return
     */
    public static ObjectOutputStream outputObjectStream(String ruta) {
        File archivo = new File(ruta);
        FileOutputStream entrada;
        ObjectOutputStream writer = null;
        try {
            entrada = new FileOutputStream(archivo);
            writer = new ObjectOutputStream(entrada);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return writer;
    }

    /**
     * Método que sirve para copiar un archivo desde una ruta otra nueva ruta
     *
     * @param rutaOriginal String de la ruta Original
     * @param rutaCopia String de la ruta Nueva
     * @return
     */
    public static boolean copyFile(String rutaOriginal, String rutaCopia) {
        boolean res = false;
        File archivoOriginal = new File(rutaOriginal);
        File archivoCopia = new File(rutaCopia);

        if (archivoOriginal.exists() == true) {
            FileInputStream entrada;
            FileOutputStream salida;
            try {
                entrada = new FileInputStream(archivoOriginal);
                salida = new FileOutputStream(archivoCopia);
                byte[] buffer = new byte[1024];
                int lon;
                while ((lon = entrada.read(buffer)) > 0) {
                    salida.write(buffer, 0, lon);
                }
                entrada.close();
                salida.close();
                res = true;
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
        return res;
    }

    /**
     * Método para guardar un archivo proveniente de un InputStrean de entrada
     *
     * @param ruta ruta del archivo que se va a guardar
     * @param entrada ImputStream de entrada
     * @return
     */
    public static boolean saveFile(String ruta, InputStream entrada) {
        boolean res = false;
        File archivo = new File(ruta);
        if (archivo.exists() == false) {
            try {
                FileOutputStream salida;
                salida = new FileOutputStream(archivo);
                byte[] buffer = new byte[1024];
                int lon;
                while ((lon = entrada.read(buffer)) > 0) {
                    salida.write(buffer, 0, lon);
                }
                entrada.close();
                salida.close();
                res = true;
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
        return res;
    }

    /**
     * Método para guardar un archivo que se encuentra en una url
     *
     * @param ruta ruta del archivo que se va a guardar
     * @param link dirección url del archivo que se quiere descargar
     * @return
     */
    public static boolean downloadFile(String ruta, String link) {
        boolean res = false;
        try {
            URL url = new URL(link);
            URLConnection urlCon = url.openConnection();
            res = saveFile(ruta, urlCon.getInputStream());
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        return res;
    }

    /**
     * Método que se utiliza para eliminar un fichero o directorio
     *
     * @param ruta
     * @return devuelve true si se ha borrado con exito
     */
    public static boolean removeFile(String ruta) {
        boolean res = false;
        File archivo = new File(ruta);
        if (archivo.exists() == true) {
            try {
                res = archivo.delete();
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return res;
    }
    /*
     * Metodo para encritar texto plano en 
     * MD2 MD5 Sha1 Sha256 Sha 384 Sha 512
     */

    //http://www.codigofantasma.com/blog/implementar-encriptacion-md5-y-sha-en-java/
    public static String getStringMessageDigest(String message, String algorithm) {
        byte[] digest = null;
        byte[] buffer = message.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error creando Digest");
        }
        return toHexadecimal(digest);
    }

    private static String toHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) {
                hash += "0";
            }
            hash += Integer.toHexString(b);
        }
        return hash;

    }

    /*
     * Metodo para crear carpetas    
     */
    public static boolean createFolder(String ruta) {
        boolean crea = false;
        File carpeta = new File(ruta);
        if (carpeta.exists() == false) {
            try {
                crea = carpeta.mkdirs();

            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return crea;
    }

    /**
     * Captura una imagen en pantalla y como parametros optine
     *
     * @param image la imagen capturada por Buffereed
     * @param ruta Lugar donde desea guardar la imagen
     * @param nombre Nombre de la imagen
     */
    public static boolean saveImagen(BufferedImage image, String ruta, String nombre) throws IOException {

        if (ruta == null || ruta.equals("")) {
            ImageIO.write(image, "jpeg", new File(ruta + nombre));
        } else {
            ImageIO.write(image, "jpeg", new File(ruta + File.separator + nombre));
        }

        return true;
    }

    /**
     * Leer texto de una URL Usado para Json u otros casos de texto cifrado o
     * texto plano Metodo agarrado de:
     * http://crunchify.com/java-url-example-getting-text-from-url/
     *
     * @param Url Nombre de la imagen
     */
    public static synchronized String callURL(String URL)  {
        System.out.println("Requeted URL:" + URL);
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        try {
            URL url = new URL(URL);
            urlConn = url.openConnection();
            if (urlConn != null) {
                urlConn.setReadTimeout(60 * 1000);
            }
            if (urlConn != null && urlConn.getInputStream() != null) {
                in = new InputStreamReader(urlConn.getInputStream(),
                        Charset.defaultCharset());
                BufferedReader bufferedReader = new BufferedReader(in);
                if (bufferedReader != null) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        sb.append((char) cp);
                    }
                    bufferedReader.close();
                }
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:" + URL, e);
        }

        return sb.toString();
    }
}
