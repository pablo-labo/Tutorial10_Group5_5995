package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.oq4;
import defpackage.xq4;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class rj0 {
    public final Object a;
    public final Object b;

    public rj0(LaunchActivity launchActivity) {
        launchActivity.getClass();
        this.a = launchActivity;
        this.b = new d2f(new wm1(this, 0));
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((oq4) this.b).a.getClass();
        if (keyListener instanceof tq4) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new tq4(keyListener);
    }

    public Object b(qf8 qf8Var, Object obj) {
        qf8Var.getClass();
        return ((nm0) this.a).k((String) this.b);
    }

    public void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, wac.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public rq4 d(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        oq4 oq4Var = (oq4) this.b;
        if (inputConnection == null) {
            oq4Var.getClass();
            inputConnection2 = null;
        } else {
            oq4.a aVar = oq4Var.a;
            aVar.getClass();
            if (!(inputConnection instanceof rq4)) {
                inputConnection = new rq4(aVar.a, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (rq4) inputConnection2;
    }

    public void e(boolean z) {
        xq4 xq4Var = ((oq4) this.b).a.b;
        if (xq4Var.c != z) {
            if (xq4Var.b != null) {
                d dVarA = d.a();
                xq4.a aVar = xq4Var.b;
                dVarA.getClass();
                hh2.m(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = dVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    dVarA.b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            xq4Var.c = z;
            if (z) {
                xq4.a(xq4Var.a, d.a().c());
            }
        }
    }

    public void f(qf8 qf8Var, Object obj, Object obj2) {
        qf8Var.getClass();
        ((nm0) this.a).b((String) this.b, (String) obj2);
    }

    public rj0(EditText editText) {
        this.a = editText;
        this.b = new oq4(editText);
    }

    public rj0(nm0 nm0Var, String str) {
        this.a = nm0Var;
        this.b = str;
    }
}
