package androidx.media3.session;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.media3.session.g;
import defpackage.e47;
import defpackage.gdb;
import defpackage.qyc;
import defpackage.r6g;
import defpackage.v8e;
import defpackage.vjg;
import defpackage.w8e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final g c;
    public final PendingIntent d;
    public final w8e e;
    public final gdb.a f;
    public final gdb.a g;
    public final Bundle h;
    public final Bundle i;
    public final z j;
    public final e47<androidx.media3.session.a> k;
    public final e47<androidx.media3.session.a> l;
    public final MediaSession.Token m;
    public final e47<androidx.media3.session.a> n;

    public final class a extends Binder {
        public a() {
        }
    }

    static {
        String str = vjg.a;
        o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(14, 36);
        t = Integer.toString(13, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(11, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public c(int i, int i2, g gVar, PendingIntent pendingIntent, e47<androidx.media3.session.a> e47Var, e47<androidx.media3.session.a> e47Var2, e47<androidx.media3.session.a> e47Var3, w8e w8eVar, gdb.a aVar, gdb.a aVar2, Bundle bundle, Bundle bundle2, z zVar, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = gVar;
        this.d = pendingIntent;
        this.k = e47Var;
        this.l = e47Var2;
        this.n = e47Var3;
        this.e = w8eVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = bundle;
        this.i = bundle2;
        this.j = zVar;
        this.m = token;
    }

    public static c a(Bundle bundle) {
        qyc qycVarF;
        qyc qycVarF2;
        qyc qycVarF3;
        g gVar;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof a) {
            return c.this;
        }
        int i = bundle.getInt(o, 0);
        int i2 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                aVar.c(androidx.media3.session.a.d(i2, bundle2));
            }
            qycVarF = aVar.f();
        } else {
            e47.b bVar2 = e47.b;
            qycVarF = qyc.e;
        }
        qyc qycVar = qycVarF;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            e47.b bVar3 = e47.b;
            e47.a aVar2 = new e47.a();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                aVar2.c(androidx.media3.session.a.d(i2, bundle3));
            }
            qycVarF2 = aVar2.f();
        } else {
            e47.b bVar4 = e47.b;
            qycVarF2 = qyc.e;
        }
        qyc qycVar2 = qycVarF2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            e47.b bVar5 = e47.b;
            e47.a aVar3 = new e47.a();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                aVar3.c(androidx.media3.session.a.d(i2, bundle4));
            }
            qycVarF3 = aVar3.f();
        } else {
            e47.b bVar6 = e47.b;
            qycVarF3 = qyc.e;
        }
        qyc qycVar3 = qycVarF3;
        Bundle bundle5 = bundle.getBundle(u);
        w8e w8eVarA = bundle5 == null ? w8e.b : w8e.a(bundle5);
        Bundle bundle6 = bundle.getBundle(w);
        gdb.a aVarB = bundle6 == null ? gdb.a.b : gdb.a.b(bundle6);
        Bundle bundle7 = bundle.getBundle(v);
        gdb.a aVarB2 = bundle7 == null ? gdb.a.b : gdb.a.b(bundle7);
        Bundle bundle8 = bundle.getBundle(x);
        Bundle bundle9 = bundle.getBundle(y);
        Bundle bundle10 = bundle.getBundle(z);
        z zVarR = bundle10 == null ? z.F : z.r(i2, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i6 = g.a.a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) {
            g.a.C0059a c0059a = new g.a.C0059a();
            c0059a.a = iBinder;
            gVar = c0059a;
        } else {
            gVar = (g) iInterfaceQueryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new c(i, i2, gVar, pendingIntent, qycVar, qycVar2, qycVar3, w8eVarA, aVarB2, aVarB, bundle12, bundle11, zVarR, token);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putBinder(p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        e47<androidx.media3.session.a> e47Var = this.k;
        boolean zIsEmpty = e47Var.isEmpty();
        String str = r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e47Var.size());
            Iterator<androidx.media3.session.a> it = e47Var.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().g());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        e47<androidx.media3.session.a> e47Var2 = this.l;
        if (!e47Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(e47Var2.size());
                Iterator<androidx.media3.session.a> it2 = e47Var2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().g());
                }
                bundle.putParcelableArrayList(s, arrayList2);
            } else {
                qyc qycVarE = androidx.media3.session.a.e(true, e47Var2, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(qycVarE.d);
                e47.b bVarListIterator = qycVarE.listIterator(0);
                while (bVarListIterator.hasNext()) {
                    arrayList3.add(((androidx.media3.session.a) bVarListIterator.next()).g());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        e47<androidx.media3.session.a> e47Var3 = this.n;
        if (!e47Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(e47Var3.size());
            Iterator<androidx.media3.session.a> it3 = e47Var3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(it3.next().g());
            }
            bundle.putParcelableArrayList(t, arrayList4);
        }
        w8e w8eVar = this.e;
        w8eVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        r6g<v8e> it4 = w8eVar.a.iterator();
        while (it4.hasNext()) {
            arrayList5.add(it4.next().b());
        }
        bundle2.putParcelableArrayList(w8e.c, arrayList5);
        bundle.putBundle(u, bundle2);
        String str2 = v;
        gdb.a aVar = this.f;
        bundle.putBundle(str2, aVar.c());
        String str3 = w;
        gdb.a aVar2 = this.g;
        bundle.putBundle(str3, aVar2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.q(y.d(aVar, aVar2), false, false).t(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
