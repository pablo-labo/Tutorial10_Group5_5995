package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n59 {

    @uh3(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super ex7>, Object> {
        final /* synthetic */ udf $observer;
        final /* synthetic */ efb $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: n59$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {77}, m = "invokeSuspend")
        public static final class C0328a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ udf $observer;
            final /* synthetic */ efb $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0328a(efb efbVar, udf udfVar, lu2<? super C0328a> lu2Var) {
                super(2, lu2Var);
                this.$this_detectDownAndDragGesturesWithObserver = efbVar;
                this.$observer = udfVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0328a(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0328a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    efb efbVar = this.$this_detectDownAndDragGesturesWithObserver;
                    udf udfVar = this.$observer;
                    this.label = 1;
                    Object objC = ap5.c(efbVar, new o59(udfVar, null), this);
                    Object obj2 = g13.a;
                    if (objC != obj2) {
                        objC = j6g.a;
                    }
                    if (objC == obj2) {
                        return obj2;
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

        @uh3(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {78}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ udf $observer;
            final /* synthetic */ efb $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(efb efbVar, udf udfVar, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$this_detectDownAndDragGesturesWithObserver = efbVar;
                this.$observer = udfVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                int i2 = 1;
                if (i == 0) {
                    r7d.b(obj);
                    efb efbVar = this.$this_detectDownAndDragGesturesWithObserver;
                    udf udfVar = this.$observer;
                    this.label = 1;
                    int i3 = 12;
                    me meVar = new me(udfVar, i3);
                    xh xhVar = new xh(udfVar, 8);
                    oe oeVar = new oe(udfVar, i3);
                    pe peVar = new pe(udfVar, 5);
                    w94 w94Var = new w94(meVar, 0);
                    m91 m91Var = new m91(xhVar, i2);
                    bo0 bo0Var = new bo0(5);
                    float f = da4.a;
                    Object objC = ap5.c(efbVar, new ba4(bo0Var, new kuc(), null, w94Var, peVar, oeVar, m91Var, null), this);
                    Object obj2 = g13.a;
                    if (objC != obj2) {
                        objC = j6g.a;
                    }
                    if (objC != obj2) {
                        objC = j6g.a;
                    }
                    if (objC != obj2) {
                        objC = j6g.a;
                    }
                    if (objC == obj2) {
                        return obj2;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(efb efbVar, udf udfVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_detectDownAndDragGesturesWithObserver = efbVar;
            this.$observer = udfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super ex7> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            C0328a c0328a = new C0328a(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null);
            i13 i13Var = i13.d;
            u63.Y(e13Var, null, i13Var, c0328a, 1);
            return u63.Y(e13Var, null, i13Var, new b(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        }
    }

    public static final Object a(efb efbVar, udf udfVar, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new a(efbVar, udfVar, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
