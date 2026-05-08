package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class na1 implements vhb {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static Method b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vhb
    public n82<Bitmap> a(Bitmap bitmap, bbb bbbVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        im3 im3VarA = bbbVar.a(width, height, config);
        try {
            e((Bitmap) im3VarA.P(), bitmap);
            return im3VarA.clone();
        } finally {
            im3VarA.close();
        }
    }

    @Override // defpackage.vhb
    public ot1 c() {
        return null;
    }

    public void d(Bitmap bitmap) {
    }

    public final void e(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (b == null) {
                    int i = Bitmaps.a;
                    b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                b.invoke(null, bitmap, bitmap2);
            } catch (ClassNotFoundException e) {
                l6.p("Wrong Native code setup, reflection failed.", e);
                return;
            } catch (IllegalAccessException e2) {
                l6.p("Wrong Native code setup, reflection failed.", e2);
                return;
            } catch (NoSuchMethodException e3) {
                l6.p("Wrong Native code setup, reflection failed.", e3);
                return;
            } catch (InvocationTargetException e4) {
                l6.p("Wrong Native code setup, reflection failed.", e4);
                return;
            }
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        d(bitmap);
    }

    @Override // defpackage.vhb
    public final String getName() {
        return "Unknown postprocessor";
    }
}
