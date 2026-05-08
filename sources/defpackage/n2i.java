package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n2i implements qne, zs4 {
    public static final k2i c = new k2i();
    public final /* synthetic */ int a;
    public final Object b;

    public n2i() {
        n3i n3iVar;
        this.a = 0;
        try {
            n3iVar = (n3i) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n3iVar = c;
        }
        n3i[] n3iVarArr = {zyh.a, n3iVar};
        t2i t2iVar = new t2i();
        t2iVar.a = n3iVarArr;
        Charset charset = mzh.a;
        this.b = t2iVar;
    }

    @Override // defpackage.zs4
    public boolean d(Object obj, File file, ova ovaVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        kt0 kt0Var = (kt0) this.b;
        byte[] bArr = (byte[]) kt0Var.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        kt0Var.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        kt0Var.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                kt0Var.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                hp8 hp8Var = (hp8) this.b;
                sb.append(hp8Var);
                sb.append(": ");
                sb.append(((Map) zte.c(hp8Var.X, hp8.b0[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n2i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
