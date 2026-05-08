package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jsmappservices.components.hybridactionoverflow.HybridActionOverflowArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpm6;", "Lv81;", "<init>", "()V", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pm6 extends v81 {
    public static final /* synthetic */ int m0 = 0;
    public int j0 = -1;
    public HybridActionOverflowArgs k0;
    public yh l0;

    public static final class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            pm6 pm6Var;
            yh yhVar;
            if (i != 5 || (yhVar = (pm6Var = pm6.this).l0) == null) {
                return;
            }
            yhVar.invoke(Integer.valueOf(pm6Var.j0));
        }
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.oj0, androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        b bVar = (b) super.H(bundle);
        bVar.Y = true;
        bVar.h().s(new a());
        return bVar;
    }

    @Override // defpackage.t81
    public final void O(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(1825720392);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            HybridActionOverflowArgs hybridActionOverflowArgs = this.k0;
            if (hybridActionOverflowArgs == null) {
                cVarH.L(-1429570333);
            } else {
                cVarH.L(-1429570332);
                String str = hybridActionOverflowArgs.a;
                String str2 = hybridActionOverflowArgs.b;
                String str3 = hybridActionOverflowArgs.c;
                ArrayList arrayList = hybridActionOverflowArgs.d;
                Integer num = hybridActionOverflowArgs.e;
                boolean zX = cVarH.x(this);
                Object objV = cVarH.v();
                if (zX || objV == b.a.a) {
                    objV = new q2(this, 13);
                    cVarH.p(objV);
                }
                xm6.a(str, str2, str3, arrayList, num, (Function1) objV, cVarH, 0);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pj(this, i, 5);
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.k0 = arguments != null ? (HybridActionOverflowArgs) arguments.getParcelable("hybrid_action_overflow_args") : null;
    }
}
