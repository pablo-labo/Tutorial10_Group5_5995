package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.o97;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class e71 {

    @uh3(c = "com.indeed.android.messaging.ui.common.BackButtonKt$BackButton$1$1", f = "BackButton.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $focusRequester;
        final /* synthetic */ e13 $scope;
        int label;

        /* JADX INFO: renamed from: e71$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.messaging.ui.common.BackButtonKt$BackButton$1$1$1", f = "BackButton.kt", l = {}, m = "invokeSuspend")
        public static final class C0214a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ sm5 $focusRequester;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0214a(sm5 sm5Var, lu2<? super C0214a> lu2Var) {
                super(2, lu2Var);
                this.$focusRequester = sm5Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0214a(this.$focusRequester, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0214a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                try {
                    sm5.b(this.$focusRequester);
                } catch (Exception e) {
                    ArrayList arrayList = lz2.a;
                    lz2.b("BackButton", "Failed to focus", false, e);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e13 e13Var, sm5 sm5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$scope = e13Var;
            this.$focusRequester = sm5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$scope, this.$focusRequester, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(this.$scope, null, null, new C0214a(this.$focusRequester, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, gu5 gu5Var, b bVar, String str) {
        gu5 gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(-1627819597);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new sm5();
                cVarH.p(objV);
            }
            sm5 sm5Var = (sm5) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                m74 m74Var = to4.a;
                objV2 = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Boolean.FALSE);
                cVarH.p(objV3);
            }
            g4a g4aVar = (g4a) objV3;
            j6g j6gVar = j6g.a;
            boolean zX = cVarH.x(e13Var);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new a(e13Var, sm5Var, null);
                cVarH.p(objV4);
            }
            to4.d(cVarH, j6gVar, (Function2) objV4);
            o97.g gVar = o97Var.i;
            e eVarA = androidx.compose.ui.focus.c.a(f.a(androidx.compose.foundation.a.b(g.n(e.a.b, 24.0f), ((Boolean) g4aVar.getValue()).booleanValue() ? o97Var.c.b.c : da2.h, ggd.a), "BackButton-".concat(str)), sm5Var);
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = new iy(1, g4aVar);
                cVarH.p(objV5);
            }
            gu5Var2 = gu5Var;
            sq6.a(gu5Var2, androidx.compose.foundation.c.b(androidx.compose.ui.focus.a.a(eVarA, (Function1) objV5), false, 3), false, ygg.b, cVarH, (i2 & 14) | 24576, 12);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d71(i, 0, gu5Var2, str);
        }
    }
}
