package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import androidx.navigation.k;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.tare.nav.a;
import defpackage.h8c;
import defpackage.lhb;
import defpackage.sp7;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zq7 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zq7(ksb ksbVar, Context context, String str) {
        this.a = 2;
        this.b = ksbVar;
        this.d = context;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj3;
                String str = (String) obj2;
                a aVar = (a) obj;
                k kVarI = eVar.i();
                if (kVarI == null || kVarI.W != R.id.ianMainFragment) {
                    Serializable ianInitialState = new IanInitialState(xj1.c, null, str, 2);
                    Bundle bundle = new Bundle();
                    if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle.putParcelable("initialState", (Parcelable) ianInitialState);
                    } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle.putSerializable("initialState", ianInitialState);
                    }
                    bundle.putBoolean("fromOnboarding", false);
                    bundle.putBoolean("fromRegPromo", false);
                    eVar.n(R.id.navActionDirectlyBottomNav, bundle);
                } else {
                    aVar.W.k(new jz2<>(str));
                }
                break;
            case 1:
                u63.Y((e13) obj3, null, null, new lhb.c((hee) obj2, (mhb) obj, null), 3);
                break;
            case 2:
                ksb ksbVar = (ksb) obj3;
                Context context = (Context) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "download-profile", null, null, 12));
                ksbVar.close();
                x1c x1cVarQ = ksbVar.Q();
                as asVar = new as(15, ksbVar, (String) obj2);
                context.getClass();
                u63.Y(ee3.p(x1cVarQ), null, null, new a2c(x1cVarQ, context, asVar, null), 3);
                break;
            case 3:
                u63.Y((e13) obj3, null, null, new h8c.a((hee) obj2, (Function1) obj, null), 3);
                break;
            default:
                Function1 function1 = (Function1) obj3;
                g4a g4aVar = (g4a) obj2;
                g4a g4aVar2 = (g4a) obj;
                String str2 = (String) g4aVar.getValue();
                if (str2 == null || zve.U(str2)) {
                    g4aVar2.setValue(Boolean.TRUE);
                } else {
                    g4aVar2.setValue(Boolean.TRUE);
                    function1.invoke((String) g4aVar.getValue());
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ zq7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
