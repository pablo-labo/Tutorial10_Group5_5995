package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class qmb implements PointerInputEventHandler {
    public final /* synthetic */ zrd a;
    public final /* synthetic */ gu5<j6g> b;
    public final /* synthetic */ g4a<z6h> c;

    @uh3(c = "com.indeed.android.filepreview.screens.PreviewFileScreenKt$PreviewTxtScreen$3$1$1$1", f = "PreviewFileScreen.kt", l = {234}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<efb, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onUserZoom;
        final /* synthetic */ zrd $scrollState;
        final /* synthetic */ g4a<z6h> $zoomState$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: qmb$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.filepreview.screens.PreviewFileScreenKt$PreviewTxtScreen$3$1$1$1$1", f = "PreviewFileScreen.kt", l = {236, 239}, m = "invokeSuspend")
        public static final class C0393a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            final /* synthetic */ gu5<j6g> $onUserZoom;
            final /* synthetic */ zrd $scrollState;
            final /* synthetic */ g4a<z6h> $zoomState$delegate;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0393a(zrd zrdVar, gu5<j6g> gu5Var, g4a<z6h> g4aVar, lu2<? super C0393a> lu2Var) {
                super(2, lu2Var);
                this.$scrollState = zrdVar;
                this.$onUserZoom = gu5Var;
                this.$zoomState$delegate = g4aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0393a c0393a = new C0393a(this.$scrollState, this.$onUserZoom, this.$zoomState$delegate, lu2Var);
                c0393a.L$0 = obj;
                return c0393a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                return ((C0393a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            
                if (r11 == r5) goto L15;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:16:0x003b). Please report as a decompilation issue!!! */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = r10.L$0
                    l61 r0 = (defpackage.l61) r0
                    int r1 = r10.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    g13 r5 = defpackage.g13.a
                    if (r1 == 0) goto L20
                    if (r1 == r4) goto L1c
                    if (r1 != r3) goto L15
                    defpackage.r7d.b(r11)
                    goto L3b
                L15:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r10)
                    r10 = 0
                    return r10
                L1c:
                    defpackage.r7d.b(r11)
                    goto L2e
                L20:
                    defpackage.r7d.b(r11)
                    r10.L$0 = r0
                    r10.label = r4
                    java.lang.Object r11 = defpackage.i8f.c(r0, r10, r2)
                    if (r11 != r5) goto L2e
                    goto L3a
                L2e:
                    r10.L$0 = r0
                    r10.label = r3
                    peb r11 = defpackage.peb.b
                    java.lang.Object r11 = r0.B1(r11, r10)
                    if (r11 != r5) goto L3b
                L3a:
                    return r5
                L3b:
                    neb r11 = (defpackage.neb) r11
                    r11.getClass()
                    java.util.List<yeb> r1 = r11.a
                    int r6 = r1.size()
                    if (r6 != r3) goto L80
                    g4a<z6h> r6 = r10.$zoomState$delegate
                    java.lang.Object r7 = r6.getValue()
                    z6h r7 = (defpackage.z6h) r7
                    zrd r8 = r10.$scrollState
                    c3a r8 = r8.a
                    dme r8 = (defpackage.dme) r8
                    int r8 = r8.e()
                    zrd r9 = r10.$scrollState
                    int r9 = r9.f()
                    z6h r11 = r7.d(r11, r8, r9)
                    r6.setValue(r11)
                    gu5<j6g> r11 = r10.$onUserZoom
                    r11.invoke()
                    java.util.Iterator r11 = r1.iterator()
                L70:
                    boolean r6 = r11.hasNext()
                    if (r6 == 0) goto L9c
                    java.lang.Object r6 = r11.next()
                    yeb r6 = (defpackage.yeb) r6
                    r6.a()
                    goto L70
                L80:
                    int r6 = r1.size()
                    if (r6 != r4) goto L9c
                    int r6 = r11.e
                    if (r6 != r2) goto L8b
                    goto L8d
                L8b:
                    if (r6 != r4) goto L9c
                L8d:
                    g4a<z6h> r6 = r10.$zoomState$delegate
                    java.lang.Object r7 = r6.getValue()
                    z6h r7 = (defpackage.z6h) r7
                    z6h r11 = r7.e(r11)
                    r6.setValue(r11)
                L9c:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    boolean r11 = defpackage.z92.F0(r1)
                    if (r11 != 0) goto L2e
                    j6g r10 = defpackage.j6g.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: qmb.a.C0393a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zrd zrdVar, gu5<j6g> gu5Var, g4a<z6h> g4aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$scrollState = zrdVar;
            this.$onUserZoom = gu5Var;
            this.$zoomState$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$scrollState, this.$onUserZoom, this.$zoomState$delegate, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            return ((a) create(efbVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            efb efbVar = (efb) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                C0393a c0393a = new C0393a(this.$scrollState, this.$onUserZoom, this.$zoomState$delegate, null);
                this.L$0 = null;
                this.label = 1;
                Object objW0 = efbVar.w0(c0393a, this);
                g13 g13Var = g13.a;
                if (objW0 == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public qmb(zrd zrdVar, gu5<j6g> gu5Var, g4a<z6h> g4aVar) {
        this.a = zrdVar;
        this.b = gu5Var;
        this.c = g4aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objD = ap5.d(efbVar, new a(this.a, this.b, this.c, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
