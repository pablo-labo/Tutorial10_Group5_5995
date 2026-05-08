package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import defpackage.zg0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class jjc {
    public final HashSet a;
    public final c3f b;
    public final zg0 c;
    public boolean d;

    public jjc() {
        c3f c3fVar = new c3f();
        zg0 zg0Var = new zg0();
        this.a = new HashSet();
        this.b = c3fVar;
        this.c = zg0Var;
    }

    public static void c(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File a(Context context, String str) {
        return new File(context.getDir("lib", 0), this.b.a(str));
    }

    public final void b(Context context, String str) throws Throwable {
        xp4 xp4Var;
        zg0.a aVarB;
        String[] strArrC;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        long j;
        if (str.length() == 0) {
            l5.q("Given library is either null or empty");
            return;
        }
        c("Beginning load of %s...", str);
        c3f c3fVar = this.b;
        HashSet hashSet = this.a;
        if (hashSet.contains(str)) {
            c("%s already loaded previously!", str);
            return;
        }
        zg0.a aVar = null;
        try {
            c3fVar.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            c("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e) {
            c("Loading the library normally failed: %s", Log.getStackTraceString(e));
            c("%s (%s) was not loaded normally, re-linking...", str, null);
            File fileA = a(context, str);
            if (!fileA.exists()) {
                File dir = context.getDir("lib", 0);
                File fileA2 = a(context, str);
                File[] fileArrListFiles = dir.listFiles(new ijc(c3fVar.a(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileA2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String[] strArr2 = strArr;
                String strA = c3fVar.a(str);
                this.c.getClass();
                try {
                    aVarB = zg0.b(context, strArr2, strA);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (aVarB == null) {
                        try {
                            strArrC = zg0.c(context, strA);
                        } catch (Exception e2) {
                            strArrC = new String[]{e2.toString()};
                        }
                        StringBuilder sbM = akb.m("Could not find '", strA, "'. Looked for: ");
                        sbM.append(Arrays.toString(strArr2));
                        sbM.append(", but only found: ");
                        throw new MissingLibraryException(l6.i(sbM, Arrays.toString(strArrC), "."));
                    }
                    ZipFile zipFile = aVarB.a;
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i < 5) {
                            c("Found %s! Extracting...", strA);
                            try {
                                if (fileA.exists() || fileA.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream(aVarB.b);
                                    } catch (FileNotFoundException unused) {
                                        inputStream2 = null;
                                    } catch (IOException unused2) {
                                        inputStream2 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = null;
                                    }
                                    try {
                                        fileOutputStream = new FileOutputStream(fileA);
                                        try {
                                            byte[] bArr = new byte[4096];
                                            j = 0;
                                            while (true) {
                                                int i3 = inputStream2.read(bArr);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i3);
                                                j += (long) i3;
                                                inputStream2 = inputStream2;
                                            }
                                            fileOutputStream.flush();
                                        } catch (FileNotFoundException unused3) {
                                            inputStream2 = inputStream2;
                                        } catch (IOException unused4) {
                                            inputStream2 = inputStream2;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = inputStream2;
                                        }
                                        try {
                                            fileOutputStream.getFD().sync();
                                            if (j == fileA.length()) {
                                                zg0.a(inputStream2);
                                                zg0.a(fileOutputStream);
                                                fileA.setReadable(true, false);
                                                fileA.setExecutable(true, false);
                                                fileA.setWritable(true);
                                                break;
                                            }
                                        } catch (FileNotFoundException | IOException unused5) {
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = inputStream2;
                                            zg0.a(inputStream);
                                            zg0.a(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused6) {
                                        fileOutputStream = null;
                                        zg0.a(inputStream2);
                                        zg0.a(fileOutputStream);
                                        i = i2;
                                    } catch (IOException unused7) {
                                        fileOutputStream = null;
                                        zg0.a(inputStream2);
                                        zg0.a(fileOutputStream);
                                        i = i2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream = inputStream2;
                                        fileOutputStream = null;
                                        zg0.a(inputStream);
                                        zg0.a(fileOutputStream);
                                        throw th;
                                    }
                                    zg0.a(inputStream2);
                                    zg0.a(fileOutputStream);
                                }
                            } catch (IOException unused8) {
                            }
                            i = i2;
                        }
                    }
                    try {
                        zipFile.close();
                        break;
                    } catch (IOException unused9) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    aVar = aVarB;
                    if (aVar != null) {
                        try {
                            aVar.a.close();
                        } catch (IOException unused10) {
                        }
                    }
                    throw th;
                }
            }
            try {
                if (this.d) {
                    try {
                        xp4Var = new xp4(fileA);
                        try {
                            List<String> listA = xp4Var.a();
                            xp4Var.close();
                            for (String str3 : listA) {
                                c3fVar.getClass();
                                b(context, str3.substring(3, str3.length() - 3));
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            if (xp4Var != null) {
                                xp4Var.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        xp4Var = null;
                    }
                }
            } catch (IOException unused11) {
            }
            String absolutePath = fileA.getAbsolutePath();
            c3fVar.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            c("%s (%s) was re-linked!", str, null);
        }
    }
}
