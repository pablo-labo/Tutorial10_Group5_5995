package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gdb;
import defpackage.ij9;
import defpackage.lz8;
import defpackage.wr3;
import java.io.IOException;
import java.io.Serializable;
import kotlin.KotlinNothingValueException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.AvroTypeException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r40 implements jk0, jg2, ru5, lz8.a, wq2, wr3.a, v84 {
    public final /* synthetic */ int a;

    public static gf8 b(Class cls, String str, String str2, int i, iwc iwcVar) {
        return iwcVar.e(new w3a(cls, str, str2, i));
    }

    public static /* synthetic */ void e() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new AvroTypeException(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new AvroRuntimeException(str);
    }

    @Override // defpackage.jk0
    public void a(Serializable serializable, Object obj) {
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).f();
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                return e47.n(Integer.valueOf(((p42) obj).a));
            default:
                Bundle bundle = (Bundle) obj;
                Uri uri = (Uri) bundle.getParcelable(ij9.i.h);
                uri.getClass();
                String string = bundle.getString(ij9.i.i);
                String string2 = bundle.getString(ij9.i.j);
                int i = bundle.getInt(ij9.i.k, 0);
                int i2 = bundle.getInt(ij9.i.l, 0);
                String string3 = bundle.getString(ij9.i.m);
                String string4 = bundle.getString(ij9.i.n);
                ij9.i.a aVar = new ij9.i.a();
                aVar.a = uri;
                aVar.b = st9.p(string);
                aVar.c = string2;
                aVar.d = i;
                aVar.e = i2;
                aVar.f = string3;
                aVar.g = string4;
                return new ij9.i(aVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:6|(1:8)(1:9)|10|(1:12)|(1:14)(1:15)|16|(31:20|36|(1:38)|39|(1:41)|42|(4:45|(3:161|47|164)(1:163)|162|43)|160|48|149|49|50|(1:52)(1:53)|54|(1:56)|(1:58)(1:59)|60|(4:63|(2:65|166)(1:167)|66|61)|165|67|(2:70|68)|168|71|(1:73)(1:74)|(1:76)(1:77)|78|(5:83|(1:85)|86|36b|90)(1:82)|91|(20:101|102|(2:104|(1:106))(2:107|(1:140))|109|153|110|111|151|112|113|114|157|115|116|117|(5:132|(1:134)|135|139|147)(6:125|(1:127)|128|129|139|147)|138|129|139|147)(22:95|(1:97)(2:98|(1:100)(0))|102|(0)(0)|109|153|110|111|151|112|113|114|157|115|116|117|(2:119|121)|132|(0)|135|139|147)|141|169)(3:21|(3:25|33|(1:35))(4:26|(2:29|27)|159|30)|31)|32|39|(0)|42|(1:43)|160|48|149|49|50|(0)(0)|54|(0)|(0)(0)|60|(1:61)|165|67|(1:68)|168|71|(0)(0)|(0)(0)|78|(5:80|83|(0)|86|36b)(0)|141|169) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0589, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x058a, code lost:
    
        r3 = null;
        android.util.Log.e("FirebaseCrashlytics", "Error retrieving app package info.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d4 A[LOOP:3: B:68:0x02ce->B:70:0x02d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0355  */
    @Override // defpackage.jg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(defpackage.l7d r42) {
        /*
            Method dump skipped, instruction units count: 1432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r40.d(l7d):java.lang.Object");
    }

    @Override // defpackage.v84
    public double f(double d) {
        return d;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        switch (this.a) {
            case 6:
                ((v20) obj).getClass();
                break;
            case 7:
                ((v20) obj).getClass();
                break;
            case 8:
            default:
                ((gdb.c) obj).H();
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((gdb.c) obj).g(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
                break;
        }
    }

    @Override // wr3.a
    public void j(j6c j6cVar) {
        ((zf5) j6cVar.get()).a();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
        }
    }

    public /* synthetic */ r40(int i) {
        this.a = i;
    }

    public /* synthetic */ r40(Object obj, int i) {
        this.a = i;
    }
}
