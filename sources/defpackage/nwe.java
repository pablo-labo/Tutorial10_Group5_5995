package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bpf;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nwe extends zs3 implements dfb, sl5, um5 {
    public gu5<j6g> f0;
    public boolean g0;
    public final g1f h0;

    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: nwe$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend")
        public static final class C0335a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ nwe this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0335a(nwe nweVar, lu2<? super C0335a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = nweVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0335a c0335a = new C0335a(this.this$0, lu2Var);
                c0335a.L$0 = obj;
                return c0335a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                return ((C0335a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
            
                if (r9 == r8) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:147:0x0256, code lost:
            
                return r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
            
                if (r5 == r8) goto L14;
             */
            /* JADX WARN: Path cross not found for [B:29:0x00a8, B:24:0x0087], limit reached: 202 */
            /* JADX WARN: Path cross not found for [B:32:0x00af, B:35:0x00b5], limit reached: 202 */
            /* JADX WARN: Path cross not found for [B:57:0x0115, B:59:0x011a], limit reached: 202 */
            /* JADX WARN: Removed duplicated region for block: B:150:0x0265  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x028c  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x0284 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0254 -> B:148:0x0257). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c4 -> B:40:0x00c7). Please report as a decompilation issue!!! */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 668
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: nwe.a.C0335a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objC = ap5.c(efbVar, new C0335a(nwe.this, null), lu2Var);
            return objC == g13.a ? objC : j6g.a;
        }
    }

    public nwe(gu5<j6g> gu5Var) {
        this.f0 = gu5Var;
        k1f k1fVarA = f1f.a(new a());
        c2(k1fVarA);
        this.h0 = k1fVarA;
    }

    @Override // defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        this.h0.R(nebVar, pebVar, j);
    }

    @Override // defpackage.dfb
    public final long R0() {
        iy3 iy3Var = us3.f(this).m0;
        androidx.compose.foundation.text.handwriting.a.a.getClass();
        int i = bpf.b;
        return bpf.a.b(iy3Var.x0(10.0f), iy3Var.x0(40.0f), iy3Var.x0(10.0f), iy3Var.x0(40.0f));
    }

    @Override // defpackage.sl5
    public final void X(ym5 ym5Var) {
        this.g0 = ym5Var.a();
    }

    @Override // defpackage.dfb
    public final void f1() {
        this.h0.f1();
    }
}
