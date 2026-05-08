package defpackage;

import androidx.media3.exoplayer.d;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.runtime.ReactHostImpl;
import defpackage.a2d;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.zxe;
import expo.modules.kotlin.jni.JNIFunctionBody;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g35 implements lz8.a, JNIFunctionBody, x.e, QueueThreadExceptionHandler, v84, wq2, a2d.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ g35(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        zxe zxeVar = (zxe) this.a;
        s83 s83Var = (s83) obj;
        zxe.a aVar = new zxe.a(s83Var.b, p83.a(s83Var.a, s83Var.c));
        zxeVar.c.add(aVar);
        long j = zxeVar.j;
        if (j == -9223372036854775807L || s83Var.d >= j) {
            zxeVar.a(aVar);
        }
    }

    @Override // a2d.b
    public void b(long j, g4b g4bVar) {
        gz1.b(j, g4bVar, ((cjg) this.a).b);
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.a;
        double d2 = hrfVar.b;
        double d3 = hrfVar.c;
        double d4 = hrfVar.d;
        return d >= hrfVar.e * d4 ? (Math.pow(d - hrfVar.f, 1.0d / hrfVar.a) - d3) / d2 : (d - hrfVar.g) / d4;
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return sVar.m(dVar, (e47) this.a);
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.a;
        AtomicInteger atomicInteger = ReactHostImpl.A;
        exc.getClass();
        reactHostImpl.r(exc);
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) {
        x9 x9Var = (x9) this.a;
        objArr.getClass();
        x9Var.invoke();
        return j6g.a;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).p0(((d) this.a).P);
    }
}
