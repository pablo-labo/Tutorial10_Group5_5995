package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.layout.w;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x80 {
    public static final ne4 a = new ne4(a.a);

    public static final class a extends mj8 implements gu5<String> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    public static final class b extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ vl8 $layoutDirection;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ tgb $popupLayout;
        final /* synthetic */ ahb $properties;
        final /* synthetic */ String $testTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tgb tgbVar, gu5<j6g> gu5Var, ahb ahbVar, String str, vl8 vl8Var) {
            super(1);
            this.$popupLayout = tgbVar;
            this.$onDismissRequest = gu5Var;
            this.$properties = ahbVar;
            this.$testTag = str;
            this.$layoutDirection = vl8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            tgb tgbVar = this.$popupLayout;
            tgbVar.f0.addView(tgbVar, tgbVar.g0);
            this.$popupLayout.l(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
            return new y80(this.$popupLayout);
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        final /* synthetic */ vl8 $layoutDirection;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ tgb $popupLayout;
        final /* synthetic */ ahb $properties;
        final /* synthetic */ String $testTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tgb tgbVar, gu5<j6g> gu5Var, ahb ahbVar, String str, vl8 vl8Var) {
            super(0);
            this.$popupLayout = tgbVar;
            this.$onDismissRequest = gu5Var;
            this.$properties = ahbVar;
            this.$testTag = str;
            this.$layoutDirection = vl8Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$popupLayout.l(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ tgb $popupLayout;
        final /* synthetic */ zgb $popupPositionProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tgb tgbVar, zgb zgbVar) {
            super(1);
            this.$popupLayout = tgbVar;
            this.$popupPositionProvider = zgbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            this.$popupLayout.setPositionProvider(this.$popupPositionProvider);
            this.$popupLayout.o();
            return new fz(1);
        }
    }

    @uh3(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {371}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ tgb $popupLayout;
        private /* synthetic */ Object L$0;
        int label;

        public static final class a extends mj8 implements Function1<Long, j6g> {
            public static final a a = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ j6g invoke(Long l) {
                l.longValue();
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tgb tgbVar, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$popupLayout = tgbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            e eVar = new e(this.$popupLayout, lu2Var);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Path cross not found for [B:20:0x0065, B:22:0x0069], limit reached: 25 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L16
                if (r0 != r2) goto L10
                java.lang.Object r0 = r8.L$0
                e13 r0 = (defpackage.e13) r0
                defpackage.r7d.b(r9)
                goto L53
            L10:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r1
            L16:
                defpackage.r7d.b(r9)
                java.lang.Object r9 = r8.L$0
                e13 r9 = (defpackage.e13) r9
                r0 = r9
            L1e:
                boolean r9 = defpackage.f13.e(r0)
                if (r9 == 0) goto L6d
                r8.L$0 = r0
                r8.label = r2
                v03 r9 = r8.getContext()
                ec7$a r3 = ec7.a.a
                v03$a r9 = r9.h1(r3)
                ec7 r9 = (defpackage.ec7) r9
                x80$e$a r3 = x80.e.a.a
                if (r9 != 0) goto L45
                v03 r9 = r8.getContext()
                ky9 r9 = defpackage.ly9.a(r9)
                java.lang.Object r9 = r9.W(r3, r8)
                goto L4e
            L45:
                fc7 r4 = new fc7
                r4.<init>(r3, r1)
                java.lang.Object r9 = r9.Q0()
            L4e:
                g13 r3 = defpackage.g13.a
                if (r9 != r3) goto L53
                return r3
            L53:
                tgb r9 = r8.$popupLayout
                int[] r3 = r9.s0
                r4 = 0
                r5 = r3[r4]
                r6 = r3[r2]
                android.view.View r7 = r9.d0
                r7.getLocationOnScreen(r3)
                r4 = r3[r4]
                if (r5 != r4) goto L69
                r3 = r3[r2]
                if (r6 == r3) goto L1e
            L69:
                r9.m()
                goto L1e
            L6d:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: x80.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends mj8 implements Function1<sl8, j6g> {
        final /* synthetic */ tgb $popupLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tgb tgbVar) {
            super(1);
            this.$popupLayout = tgbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(sl8 sl8Var) {
            sl8 sl8VarU = sl8Var.U();
            sl8VarU.getClass();
            this.$popupLayout.n(sl8VarU);
            return j6g.a;
        }
    }

    public static final class g implements ag9 {
        public final /* synthetic */ tgb a;
        public final /* synthetic */ vl8 b;

        public static final class a extends mj8 implements Function1<w.a, j6g> {
            public static final a a = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ j6g invoke(w.a aVar) {
                return j6g.a;
            }
        }

        public g(tgb tgbVar, vl8 vl8Var) {
            this.a = tgbVar;
            this.b = vl8Var;
        }

        @Override // defpackage.ag9
        public final bg9 c(q qVar, List<? extends vf9> list, long j) {
            this.a.setParentLayoutDirection(this.b);
            return qVar.Y0(0, 0, bs4.a, a.a);
        }
    }

    public static final class h extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ zgb $popupPositionProvider;
        final /* synthetic */ ahb $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(zgb zgbVar, gu5<j6g> gu5Var, ahb ahbVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$popupPositionProvider = zgbVar;
            this.$onDismissRequest = gu5Var;
            this.$properties = ahbVar;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            x80.a(this.$popupPositionProvider, this.$onDismissRequest, this.$properties, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements gu5<UUID> {
        public static final i a = new i(0);

        @Override // defpackage.gu5
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class j extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ ese<Function2<androidx.compose.runtime.b, Integer, j6g>> $currentContent$delegate;
        final /* synthetic */ tgb $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tgb tgbVar, g4a g4aVar) {
            super(2);
            this.$this_apply = tgbVar;
            this.$currentContent$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (objV == c0020a) {
                    objV = z80.a;
                    bVar2.p(objV);
                }
                androidx.compose.ui.e eVarB = b5e.b(e.a.b, false, (Function1) objV);
                boolean zX = bVar2.x(this.$this_apply);
                tgb tgbVar = this.$this_apply;
                Object objV2 = bVar2.v();
                if (zX || objV2 == c0020a) {
                    objV2 = new a90(tgbVar);
                    bVar2.p(objV2);
                }
                androidx.compose.ui.e eVarG = ygg.g(u.a(eVarB, (Function1) objV2), this.$this_apply.getCanCalculatePosition() ? 1.0f : 0.0f);
                ese<Function2<androidx.compose.runtime.b, Integer, j6g>> eseVar = this.$currentContent$delegate;
                ne4 ne4Var = x80.a;
                Function2<androidx.compose.runtime.b, Integer, j6g> value = eseVar.getValue();
                Object objV3 = bVar2.v();
                if (objV3 == c0020a) {
                    objV3 = b90.a;
                    bVar2.p(objV3);
                }
                ag9 ag9Var = (ag9) objV3;
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarG);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ag9Var, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                value.invoke(bVar2, 0);
                bVar2.q();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.zgb r23, defpackage.gu5<defpackage.j6g> r24, defpackage.ahb r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r26, androidx.compose.runtime.b r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x80.a(zgb, gu5, ahb, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
