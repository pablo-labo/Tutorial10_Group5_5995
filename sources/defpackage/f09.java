package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import defpackage.grg;
import defpackage.p63;
import defpackage.uv0;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class f09 extends e09 {
    public final zv8 a;
    public final c b;

    public static class a<D> extends g3a<D> {
        public final qdh l;
        public zv8 m;
        public b<D> n;

        public a(qdh qdhVar) {
            this.l = qdhVar;
            if (qdhVar.a == null) {
                qdhVar.a = this;
            } else {
                r6.g("There is already a listener registered");
                throw null;
            }
        }

        @Override // defpackage.pz8
        public final void g() {
            qdh qdhVar = this.l;
            qdhVar.b = true;
            qdhVar.d = false;
            qdhVar.c = false;
            qdhVar.i.drainPermits();
            qdhVar.a();
            qdhVar.g = new uv0.a();
            qdhVar.b();
        }

        @Override // defpackage.pz8
        public final void h() {
            this.l.b = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz8
        public final void i(goa<? super D> goaVar) {
            super.i(goaVar);
            this.m = null;
            this.n = null;
        }

        public final void l() {
            zv8 zv8Var = this.m;
            b<D> bVar = this.n;
            if (zv8Var == null || bVar == null) {
                return;
            }
            super.i(bVar);
            e(zv8Var, bVar);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            hh2.i(sb, this.l);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class b<D> implements goa<D> {
        public final c00 a;
        public boolean b = false;

        public b(qdh qdhVar, c00 c00Var) {
            this.a = c00Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.goa
        public final void d(D d) {
            SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.a;
            signInHubActivity.setResult(signInHubActivity.s0, signInHubActivity.t0);
            signInHubActivity.finish();
            this.b = true;
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public static class c extends brg {
        public static final a d = new a();
        public final loe<a> b = new loe<>();
        public boolean c = false;

        public static class a implements grg.c {
            @Override // grg.c
            public final <T extends brg> T c(Class<T> cls) {
                return new c();
            }
        }

        @Override // defpackage.brg
        public final void f() {
            loe<a> loeVar = this.b;
            int iH = loeVar.h();
            for (int i = 0; i < iH; i++) {
                a aVarI = loeVar.i(i);
                qdh qdhVar = aVarI.l;
                qdhVar.a();
                qdhVar.c = true;
                b<D> bVar = aVarI.n;
                if (bVar != 0) {
                    aVarI.i(bVar);
                }
                a aVar = qdhVar.a;
                if (aVar == null) {
                    r6.g("No listener register");
                    return;
                }
                if (aVar != aVarI) {
                    l5.q("Attempting to unregister the wrong listener");
                    return;
                }
                qdhVar.a = null;
                if (bVar != 0) {
                    boolean z = bVar.b;
                }
                qdhVar.d = true;
                qdhVar.b = false;
                qdhVar.c = false;
                qdhVar.e = false;
            }
            int i2 = loeVar.d;
            Object[] objArr = loeVar.c;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            loeVar.d = 0;
            loeVar.a = false;
        }
    }

    public f09(zv8 zv8Var, irg irgVar) {
        this.a = zv8Var;
        irgVar.getClass();
        p63.a aVar = p63.a.b;
        aVar.getClass();
        hrg hrgVar = new hrg(irgVar, c.d, aVar);
        yd8 yd8VarB = fwc.a.b(c.class);
        String strP = yd8VarB.p();
        if (strP != null) {
            this.b = (c) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        } else {
            l5.q("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.b;
        if (cVar.b.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.b.h(); i++) {
                a aVarI = cVar.b.i(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.b.f(i));
                printWriter.print(": ");
                printWriter.println(aVarI.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aVarI.l);
                qdh qdhVar = aVarI.l;
                String strConcat = str2.concat("  ");
                qdhVar.getClass();
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(qdhVar.a);
                if (qdhVar.b || qdhVar.e) {
                    printWriter.print(strConcat);
                    printWriter.print("mStarted=");
                    printWriter.print(qdhVar.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(qdhVar.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (qdhVar.c || qdhVar.d) {
                    printWriter.print(strConcat);
                    printWriter.print("mAbandoned=");
                    printWriter.print(qdhVar.c);
                    printWriter.print(" mReset=");
                    printWriter.println(qdhVar.d);
                }
                if (qdhVar.g != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mTask=");
                    printWriter.print(qdhVar.g);
                    printWriter.print(" waiting=");
                    qdhVar.g.getClass();
                    printWriter.println(false);
                }
                if (qdhVar.h != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(qdhVar.h);
                    printWriter.print(" waiting=");
                    qdhVar.h.getClass();
                    printWriter.println(false);
                }
                if (aVarI.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarI.n);
                    b<D> bVar = aVarI.n;
                    String strConcat2 = str2.concat("  ");
                    bVar.getClass();
                    printWriter.print(strConcat2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                qdh qdhVar2 = aVarI.l;
                D d = aVarI.d();
                qdhVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                hh2.i(sb, d);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarI.c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        hh2.i(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
