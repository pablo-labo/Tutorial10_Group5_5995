package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsq;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sq extends w0g {
    public final zcd g0 = new zcd();
    public final t41 h0 = new t41(jz0.a());
    public final frg i0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new oq(this, 0));
    public Function2<? super ps7, ? super yr7, j6g> j0;

    public static final class a {
        public static sq a(yr7 yr7Var, boolean z) {
            sq sqVar = new sq();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", z);
            if ((yr7Var != null ? yr7Var.b : null) != null) {
                bundle.putString("KEY_LANGUAGE", yr7Var.b);
            }
            if ((yr7Var != null ? yr7Var.c : null) != null) {
                bundle.putString("KEY_LANGUAGE_TAXONOMY_ID", yr7Var.c);
            }
            if ((yr7Var != null ? yr7Var.d : null) != null) {
                bundle.putString("KEY_PROFICIENCY", yr7Var.d);
            }
            if ((yr7Var != null ? yr7Var.e : null) != null) {
                bundle.putString("KEY_PROFICIENCY_TAXONOMY_ID", yr7Var.e);
            }
            sqVar.setArguments(bundle);
            return sqVar;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sq sqVar) {
            super(0);
            this.$this_activityViewModels = sqVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sq sqVar) {
            super(0);
            this.$this_activityViewModels = sqVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-848242623);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            wj8 wj8Var = Q().v().P;
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new pq(this, i3);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new qq(this, i3);
                cVarH.p(objV2);
            }
            fr.a(this.h0, function1, (gu5) objV2, b5gVarW, hw9Var, wj8Var, cVarH, 32768, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(this, i, i3);
        }
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r63) {
        /*
            r62 = this;
            super.onCreate(r63)
            yvb r0 = r62.Q()
            g4a r0 = r0.e
            gme r0 = (defpackage.gme) r0
            b5g r1 = defpackage.b5g.a
            r0.setValue(r1)
            android.os.Bundle r0 = r62.getArguments()
            if (r63 != 0) goto Lc0
            r1 = 0
            if (r0 != 0) goto L1c
        L19:
            r46 = r1
            goto L47
        L1c:
            java.lang.String r2 = "KEY_LANGUAGE"
            java.lang.String r6 = r0.getString(r2)
            java.lang.String r2 = "KEY_LANGUAGE_TAXONOMY_ID"
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "KEY_PROFICIENCY_TAXONOMY_ID"
            java.lang.String r9 = r0.getString(r2)
            if (r6 == 0) goto L19
            java.lang.String r2 = "KEY_PROFICIENCY"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L3c
            java.lang.String r1 = r0.getString(r2)
        L3c:
            r8 = r1
            wj8 r3 = new wj8
            r4 = 32
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r46 = r3
        L47:
            yvb r0 = r62.Q()
            svb r4 = r0.v()
            r60 = -1
            r61 = 8388095(0x7ffdff, float:1.1754225E-38)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            svb r1 = defpackage.svb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            g4a r0 = r0.d
            gme r0 = (defpackage.gme) r0
            r0.setValue(r1)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.j0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-language", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-language", null, null, 12));
    }
}
