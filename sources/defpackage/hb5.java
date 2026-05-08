package defpackage;

import defpackage.xa5;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import xa5.b;

/* JADX INFO: loaded from: classes3.dex */
public class hb5 extends jh2 {
    public static void N(File file, String str) throws IOException {
        Charset charset = a32.b;
        file.getClass();
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            X(fileOutputStream, str, charset);
            j6g j6gVar = j6g.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void O(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                wg2.u(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean P(File file) {
        file.getClass();
        xa5.b bVar = new xa5(file, eb5.b, null).new b();
        while (true) {
            boolean z = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (!next.delete() && next.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static String Q(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return zve.o0(JwtParser.SEPARATOR_CHAR, name, "");
    }

    public static final ea5 R(ea5 ea5Var) {
        File file = ea5Var.a;
        List<File> list = ea5Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (wl7.b(name, ".")) {
                j6g j6gVar = j6g.a;
            } else if (!wl7.b(name, "..")) {
                arrayList.add(file2);
            } else if (arrayList.isEmpty() || wl7.b(((File) z92.Y0(arrayList)).getName(), "..")) {
                arrayList.add(file2);
            }
        }
        return new ea5(file, arrayList);
    }

    public static byte[] S(File file) throws IOException {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    n45 n45Var = new n45(8193);
                    n45Var.write(i5);
                    wg2.u(fileInputStream, n45Var);
                    int size = n45Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = n45Var.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    pyd.g(i, 0, n45Var.size(), bArrA, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0h.q(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String T(File file, Charset charset) throws IOException {
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strY = nn2.y(inputStreamReader);
            inputStreamReader.close();
            return strY;
        } finally {
        }
    }

    public static File U(File file) {
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        if (jh2.v(path) > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!zve.O(string, c)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }

    public static final String V(File file, File file2) throws IOException {
        String string;
        ea5 ea5VarR = R(jh2.H(file));
        List<File> list = ea5VarR.b;
        ea5 ea5VarR2 = R(jh2.H(file2));
        List<File> list2 = ea5VarR2.b;
        if (ea5VarR.a.equals(ea5VarR2.a)) {
            int size = list2.size();
            int size2 = list.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && wl7.b(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (!wl7.b(list2.get(i2).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
                string = null;
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                List listJ0 = z92.J0(list, i);
                String str = File.separator;
                str.getClass();
                z92.V0(listJ0, sb, str, null, null, null, 124);
            }
            string = sb.toString();
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        p6.i("this and base files have different roots: ", file, " and ", file2, 46);
        return null;
    }

    public static void W(File file, byte[] bArr) throws IOException {
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            j6g j6gVar = j6g.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void X(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        str.getClass();
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                r6.g("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
