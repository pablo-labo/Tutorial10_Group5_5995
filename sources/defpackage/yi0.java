package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.media.metrics.TrackChangeEvent;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.source.i;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.z;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.indeed.android.jobsearch.R;
import defpackage.wr3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yi0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

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
    @Override // java.lang.Runnable
    public final void run() {
        wr3.a<T> aVar;
        switch (this.a) {
            case 0:
                zi0 zi0Var = (zi0) this.b;
                wi0 wi0Var = (wi0) this.c;
                Iterator<rpa> it = zi0Var.a.iterator();
                it.getClass();
                while (it.hasNext()) {
                    it.next().a(wi0Var);
                }
                return;
            case 1:
                ry0 ry0Var = (ry0) this.b;
                Exception exc = (Exception) this.c;
                d.a aVar2 = ry0Var.b;
                String str = vjg.a;
                d.this.s.n0(exc);
                return;
            case 2:
                mva mvaVar = (mva) this.b;
                j6c<T> j6cVar = (j6c) this.c;
                if (mvaVar.b != mva.d) {
                    r6.g("provide() can be called only once.");
                    return;
                }
                synchronized (mvaVar) {
                    aVar = mvaVar.a;
                    mvaVar.a = null;
                    mvaVar.b = j6cVar;
                    break;
                }
                aVar.j(j6cVar);
                return;
            case 3:
                tm3 tm3Var = (tm3) this.b;
                String str2 = (String) this.c;
                PopupWindow popupWindow = tm3Var.c;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    Activity activityA = tm3Var.a.a();
                    if (activityA == null) {
                        s55.f("ReactNative", "Unable to display loading message because react activity isn't available");
                        return;
                    }
                    try {
                        Rect rect = new Rect();
                        activityA.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        int i = rect.top;
                        Object systemService = activityA.getSystemService("layout_inflater");
                        systemService.getClass();
                        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dev_loading_view, (ViewGroup) null);
                        viewInflate.getClass();
                        TextView textView = (TextView) viewInflate;
                        textView.setText(str2);
                        PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                        popupWindow2.setTouchable(false);
                        popupWindow2.showAtLocation(activityA.getWindow().getDecorView(), 0, 0, i);
                        tm3Var.b = textView;
                        tm3Var.c = popupWindow2;
                        return;
                    } catch (WindowManager.BadTokenException unused) {
                        s55.f("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str2);
                        return;
                    }
                }
                return;
            case 4:
                ((rj9) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 5:
                s sVar = (s) this.b;
                vdb vdbVar = (vdb) this.c;
                t tVar = sVar.h;
                sVar.t = vdbVar;
                s.d dVar = new s.d(sVar, vdbVar);
                vdbVar.Z(dVar);
                sVar.u = dVar;
                try {
                    tVar.i.m(0, vdbVar);
                    break;
                } catch (RemoteException e) {
                    zkd.x("MediaSessionImpl", "Exception in using media1 API", e);
                }
                tVar.k.a.a.setActive(true);
                sVar.s = new z(vdbVar.a(), 0, vdbVar.o0(), vdbVar.x(), vdbVar.x(), 0, vdbVar.e(), vdbVar.i(), vdbVar.D0(), vdbVar.d0(), vdbVar.U0(), 0, vdbVar.O0(18) ? vdbVar.s0() : oj9.K, vdbVar.O0(22) ? vdbVar.e0() : 1.0f, vdbVar.O0(21) ? vdbVar.f0() : ox0.h, vdbVar.O0(28) ? vdbVar.E() : q83.d, vdbVar.g0(), vdbVar.O0(23) ? vdbVar.S() : 0, vdbVar.W0(), vdbVar.W(), 1, vdbVar.L(), vdbVar.b(), vdbVar.t0(), vdbVar.d(), vdbVar.V0(), vdbVar.L0(), vdbVar.n0(), vdbVar.Y(), vdbVar.O0(30) ? vdbVar.D() : wqf.b, vdbVar.P());
                sVar.g(vdbVar.V());
                return;
            case 6:
                ((wq2) this.b).accept((i) this.c);
                return;
            default:
                StatusBarModule.setStyle$lambda$2((Activity) this.b, (String) this.c);
                return;
        }
    }
}
