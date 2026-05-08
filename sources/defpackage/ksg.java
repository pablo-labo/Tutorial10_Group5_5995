package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ksg extends pnb {
    public static boolean o0 = true;
    public static boolean p0 = true;
    public static boolean q0 = true;
    public static boolean r0 = true;

    @SuppressLint({"NewApi"})
    public float U(View view) {
        if (o0) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                o0 = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void V(View view, int i, int i2, int i3, int i4) {
        if (r0) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                r0 = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void W(View view, float f) {
        if (o0) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                o0 = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    public void X(View view, Matrix matrix) {
        if (p0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                p0 = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void Y(View view, Matrix matrix) {
        if (q0) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                q0 = false;
            }
        }
    }
}
