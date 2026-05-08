package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class hg1 implements n5d<Bitmap> {
    public static final fva<Integer> b = fva.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final fva<Bitmap.CompressFormat> c = new fva<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, fva.e);
    public final kt0 a;

    public hg1(kt0 kt0Var) {
        this.a = kt0Var;
    }

    @Override // defpackage.n5d
    public final ss4 c(ova ovaVar) {
        return ss4.b;
    }

    @Override // defpackage.zs4
    public final boolean d(Object obj, File file, ova ovaVar) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((f5d) obj).get();
        fva<Bitmap.CompressFormat> fvaVar = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) ovaVar.c(fvaVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = n39.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) ovaVar.c(b)).intValue();
        OutputStream qo1Var = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                kt0 kt0Var = this.a;
                if (kt0Var != null) {
                    try {
                        qo1Var = new qo1(fileOutputStream, kt0Var);
                    } catch (IOException e) {
                        e = e;
                        qo1Var = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (qo1Var != null) {
                            try {
                                qo1Var.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        qo1Var = fileOutputStream;
                        if (qo1Var != null) {
                            try {
                                qo1Var.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    qo1Var = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, qo1Var);
                qo1Var.close();
                try {
                    qo1Var.close();
                } catch (IOException unused3) {
                }
                z = true;
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + xjg.c(bitmap) + " in " + n39.a(jElapsedRealtimeNanos) + ", options format: " + ovaVar.c(fvaVar) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
