package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.l;
import androidx.media3.session.r;
import androidx.media3.session.t;
import androidx.media3.session.z;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.e;
import defpackage.e75;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.tze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q20 implements t20, e75.e, e.b, k.c, lz8.a, t.g, gna, v84, tze.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gna
    public Object b() {
        return ((ve8) this.b).callBy(bs4.a);
    }

    @Override // tze.c
    public tze c(tze.b bVar) {
        Context context = (Context) this.b;
        String str = bVar.b;
        tze.a aVar = bVar.c;
        aVar.getClass();
        if (str != null && str.length() != 0) {
            return new FrameworkSQLiteOpenHelper(context, str, aVar, true, true);
        }
        l5.q("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.H0();
    }

    @Override // com.oney.WebRTCModule.e.b
    public void e(String str, ArrayList arrayList) {
        Callback callback = (Callback) this.b;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap((WritableMap) it.next());
        }
        callback.invoke(str, writableArrayCreateArray);
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.b;
        double d2 = hrfVar.b;
        return d >= hrfVar.e ? Math.pow((d2 * d) + hrfVar.c, hrfVar.a) : hrfVar.d * d;
    }

    @Override // defpackage.t20
    public void g(Bundle bundle) {
        ((s20) this.b).a.g(bundle);
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.X0(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 7:
                ((gdb.c) obj).E(((z) obj2).m);
                break;
            default:
                ((gdb.c) obj).v0(((l.c) obj2).a.v);
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        ((e75) this.b).a.getClass();
        if (!(obj instanceof Map)) {
            return new HashMap(0);
        }
        Map map = (Map) obj;
        map.clear();
        return map;
    }
}
