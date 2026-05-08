package defpackage;

import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gs2 {

    @uh3(c = "com.indeed.android.profile.screens.ContactInformationScreenKt$ContactInformationScreen$3$1", f = "ContactInformationScreen.kt", l = {218}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $firstNameFocusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sm5 sm5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$firstNameFocusRequester = sm5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$firstNameFocusRequester, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                this.label = 1;
                Object objB = ls3.b(100L, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            sm5.b(this.$firstNameFocusRequester);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.ContactInformationScreenKt$ContactInformationScreen$5$1", f = "ContactInformationScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            dg3.g(dg3.b(null, "rich-profile-contact-info-screen", null, null, 13));
            return j6g.a;
        }
    }

    public static final class c implements l74 {
        public final /* synthetic */ gu5 a;

        public c(gu5 gu5Var) {
            this.a = gu5Var;
        }

        @Override // defpackage.l74
        public final void dispose() {
            this.a.invoke();
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            dg3.i(dg3.b(null, "rich-profile-contact-info-screen", null, null, 13));
        }
    }

    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qr2.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0699  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.gu5<defpackage.j6g> r54, final defpackage.yz7 r55, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r56, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r57, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r58, final kotlin.jvm.functions.Function1<? super defpackage.jhf, defpackage.j6g> r59, final defpackage.gu5<defpackage.j6g> r60, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, defpackage.j6g> r61, final defpackage.gu5<defpackage.j6g> r62, final defpackage.gu5<defpackage.j6g> r63, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r64, final defpackage.gu5<defpackage.j6g> r65, kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r66, final kotlin.jvm.functions.Function1<? super java.lang.String, defpackage.j6g> r67, final kotlin.jvm.functions.Function1<? super defpackage.o18, defpackage.j6g> r68, final kotlin.jvm.functions.Function1<? super defpackage.gu5<defpackage.j6g>, defpackage.j6g> r69, defpackage.b5g r70, defpackage.gu5<defpackage.j6g> r71, defpackage.qr2 r72, final defpackage.gu5<defpackage.j6g> r73, final defpackage.gu5<java.lang.Boolean> r74, androidx.compose.runtime.b r75, final int r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instruction units count: 1826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs2.a(gu5, yz7, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gu5, kotlin.jvm.functions.Function1, gu5, gu5, kotlin.jvm.functions.Function1, gu5, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, b5g, gu5, qr2, gu5, gu5, androidx.compose.runtime.b, int, int, int, int):void");
    }

    public static final void b(gu5<j6g> gu5Var, androidx.compose.runtime.b bVar, int i) {
        gu5Var.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(2073390283);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            iv6.a(bh2.c(114290005, new oq0((o97) cVarH.M(p97.a), 2), cVarH), f.a(androidx.compose.foundation.a.b(e.a.b, da2.h, ytc.a), "TopNavHome"), false, null, false, null, bh2.c(1298296430, new vr2(0, gu5Var), cVarH), null, cVarH, 12582966, 380);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wr2(i, 0, gu5Var);
        }
    }
}
