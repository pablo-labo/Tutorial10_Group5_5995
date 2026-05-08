package defpackage;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.indeed.android.jobsearch.R;
import defpackage.kv8;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class qpg extends pnb {
    public static final a A0 = new a();
    public static final ReferenceQueue<qpg> B0 = new ReferenceQueue<>();
    public static final b C0 = new b();
    public static final boolean z0 = true;
    public final c o0;
    public boolean p0;
    public final mug[] q0;
    public final View r0;
    public boolean s0;
    public final Choreographer t0;
    public final rpg u0;
    public final Handler v0;
    public Fragment w0;
    public e x0;
    public boolean y0;

    public class a implements l63 {
        @Override // defpackage.l63
        public final mug a(qpg qpgVar, int i, ReferenceQueue<qpg> referenceQueue) {
            return new d(qpgVar, i, referenceQueue).a;
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA)
        public final void onViewAttachedToWindow(View view) {
            (view != null ? (qpg) view.getTag(R.id.dataBinding) : null).o0.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                qpg.this.p0 = false;
            }
            while (true) {
                Reference<? extends qpg> referencePoll = qpg.B0.poll();
                if (referencePoll == null) {
                    break;
                } else if (referencePoll instanceof mug) {
                    ((mug) referencePoll).a();
                }
            }
            boolean zIsAttachedToWindow = qpg.this.r0.isAttachedToWindow();
            qpg qpgVar = qpg.this;
            if (!zIsAttachedToWindow) {
                View view = qpgVar.r0;
                b bVar = qpg.C0;
                view.removeOnAttachStateChangeListener(bVar);
                qpg.this.r0.addOnAttachStateChangeListener(bVar);
                return;
            }
            if (qpgVar.s0) {
                qpgVar.a0();
            } else if (qpgVar.V()) {
                qpgVar.s0 = true;
                qpgVar.U();
                qpgVar.s0 = false;
            }
        }
    }

    public static class d implements goa, aoa<pz8<?>> {
        public final mug<pz8<?>> a;
        public WeakReference<zv8> b = null;

        public d(qpg qpgVar, int i, ReferenceQueue<qpg> referenceQueue) {
            this.a = new mug<>(qpgVar, i, this, referenceQueue);
        }

        @Override // defpackage.aoa
        public final void a(zv8 zv8Var) {
            WeakReference<zv8> weakReference = this.b;
            zv8 zv8Var2 = weakReference == null ? null : weakReference.get();
            pz8<?> pz8Var = this.a.c;
            if (pz8Var != null) {
                if (zv8Var2 != null) {
                    pz8Var.i(this);
                }
                if (zv8Var != null) {
                    pz8Var.e(zv8Var, this);
                }
            }
            if (zv8Var != null) {
                this.b = new WeakReference<>(zv8Var);
            }
        }

        @Override // defpackage.aoa
        public final void b(pz8<?> pz8Var) {
            pz8Var.i(this);
        }

        @Override // defpackage.aoa
        public final void c(pz8<?> pz8Var) {
            pz8<?> pz8Var2 = pz8Var;
            WeakReference<zv8> weakReference = this.b;
            zv8 zv8Var = weakReference == null ? null : weakReference.get();
            if (zv8Var != null) {
                pz8Var2.e(zv8Var, this);
            }
        }

        @Override // defpackage.goa
        public final void d(Object obj) {
            mug<pz8<?>> mugVar = this.a;
            qpg qpgVar = (qpg) mugVar.get();
            if (qpgVar == null) {
                mugVar.a();
            }
            if (qpgVar != null) {
                int i = mugVar.b;
                pz8<?> pz8Var = mugVar.c;
                if (qpgVar.y0 || !qpgVar.Y(pz8Var, i, 0)) {
                    return;
                }
                qpgVar.a0();
            }
        }
    }

    public static class e implements yv8 {
        public final WeakReference<qpg> a;

        public e(qpg qpgVar) {
            this.a = new WeakReference<>(qpgVar);
        }

        @qqa(kv8.a.ON_START)
        public void onStart() {
            qpg qpgVar = this.a.get();
            if (qpgVar != null) {
                if (qpgVar.s0) {
                    qpgVar.a0();
                } else if (qpgVar.V()) {
                    qpgVar.s0 = true;
                    qpgVar.U();
                    qpgVar.s0 = false;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpg(Object obj, View view, int i) {
        super(13);
        if (obj != null && !(obj instanceof vd3)) {
            l5.q("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            throw null;
        }
        this.o0 = new c();
        this.p0 = false;
        this.q0 = new mug[i];
        this.r0 = view;
        if (Looper.myLooper() == null) {
            r6.g("DataBinding must be created in view's UI Thread");
            throw null;
        }
        this.t0 = Choreographer.getInstance();
        this.u0 = new rpg(this);
    }

    public static qpg W(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return wd3.a.b(null, layoutInflater.inflate(i, viewGroup, false), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void X(android.view.View r5, java.lang.Object[] r6, android.util.SparseIntArray r7, boolean r8) {
        /*
            r0 = 0
            if (r5 == 0) goto Ld
            r1 = 2131362027(0x7f0a00eb, float:1.8343823E38)
            java.lang.Object r1 = r5.getTag(r1)
            qpg r1 = (defpackage.qpg) r1
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L12
            goto Lb8
        L12:
            java.lang.Object r1 = r5.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1d
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L1d:
            r1 = 0
            if (r8 == 0) goto L66
            if (r0 == 0) goto L66
            java.lang.String r8 = "layout"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L66
            r8 = 95
            int r8 = r0.lastIndexOf(r8)
            if (r8 <= 0) goto L8c
            int r8 = r8 + 1
            int r2 = r0.length()
            if (r2 != r8) goto L3b
            goto L8c
        L3b:
            r3 = r8
        L3c:
            if (r3 >= r2) goto L4c
            char r4 = r0.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L49
            goto L8c
        L49:
            int r3 = r3 + 1
            goto L3c
        L4c:
            int r2 = r0.length()
            r3 = r1
        L51:
            if (r8 >= r2) goto L5f
            int r3 = r3 * 10
            char r4 = r0.charAt(r8)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r8 = r8 + 1
            goto L51
        L5f:
            r8 = r6[r3]
            if (r8 != 0) goto La1
            r6[r3] = r5
            goto La1
        L66:
            if (r0 == 0) goto L8c
            java.lang.String r8 = "binding_"
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L8c
            int r8 = r0.length()
            r2 = 8
            r3 = r1
        L77:
            if (r2 >= r8) goto L85
            int r3 = r3 * 10
            char r4 = r0.charAt(r2)
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L77
        L85:
            r8 = r6[r3]
            if (r8 != 0) goto La1
            r6[r3] = r5
            goto La1
        L8c:
            int r8 = r5.getId()
            if (r8 <= 0) goto La1
            if (r7 == 0) goto La1
            r0 = -1
            int r8 = r7.get(r8, r0)
            if (r8 < 0) goto La1
            r0 = r6[r8]
            if (r0 != 0) goto La1
            r6[r8] = r5
        La1:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto Lb8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = r5.getChildCount()
            r0 = r1
        Lac:
            if (r0 >= r8) goto Lb8
            android.view.View r2 = r5.getChildAt(r0)
            X(r2, r6, r7, r1)
            int r0 = r0 + 1
            goto Lac
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpg.X(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public abstract void U();

    public abstract boolean V();

    public abstract boolean Y(Object obj, int i, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Z(int i, g3a g3aVar, l63 l63Var) {
        if (g3aVar == 0) {
            return;
        }
        mug[] mugVarArr = this.q0;
        mug mugVarA = mugVarArr[i];
        if (mugVarA == null) {
            mugVarA = l63Var.a(this, i, B0);
            mugVarArr[i] = mugVarA;
            Fragment fragment = this.w0;
            if (fragment != null) {
                mugVarA.a.a(fragment);
            }
        }
        mugVarA.a();
        mugVarA.c = g3aVar;
        mugVarA.a.c(g3aVar);
    }

    public final void a0() {
        Fragment fragment = this.w0;
        if (fragment == null || fragment.getLifecycle().b().compareTo(kv8.b.d) >= 0) {
            synchronized (this) {
                try {
                    if (this.p0) {
                        return;
                    }
                    this.p0 = true;
                    if (z0) {
                        this.t0.postFrameCallback(this.u0);
                    } else {
                        this.v0.post(this.o0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b0(Fragment fragment) {
        Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        Fragment fragment2 = this.w0;
        if (fragment2 == fragment) {
            return;
        }
        if (fragment2 != null) {
            fragment2.getLifecycle().c(this.x0);
        }
        this.w0 = fragment;
        if (this.x0 == null) {
            this.x0 = new e(this);
        }
        fragment.getLifecycle().a(this.x0);
        for (mug mugVar : this.q0) {
            if (mugVar != null) {
                mugVar.a.a(fragment);
            }
        }
    }

    public final void c0(int i, g3a g3aVar) {
        this.y0 = true;
        try {
            a aVar = A0;
            mug[] mugVarArr = this.q0;
            if (g3aVar == null) {
                mug mugVar = mugVarArr[i];
                if (mugVar != null) {
                    mugVar.a();
                }
            } else {
                mug mugVar2 = mugVarArr[i];
                if (mugVar2 == null) {
                    Z(i, g3aVar, aVar);
                } else if (mugVar2.c != g3aVar) {
                    if (mugVar2 != null) {
                        mugVar2.a();
                    }
                    Z(i, g3aVar, aVar);
                }
            }
        } finally {
            this.y0 = false;
        }
    }
}
