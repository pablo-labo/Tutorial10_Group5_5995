package defpackage;

import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yd9 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, androidx.compose.ui.e eVar, tjf tjfVar, int i, int i2) {
            super(2);
            this.$content = str;
            this.$modifier = eVar;
            this.$style = tjfVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            yd9.c(this.$content, this.$modifier, this.$style, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ le0 $content;
        final /* synthetic */ o45 $extendedSpans;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(le0 le0Var, androidx.compose.ui.e eVar, tjf tjfVar, o45 o45Var, int i, int i2) {
            super(2);
            this.$content = le0Var;
            this.$modifier = eVar;
            this.$style = tjfVar;
            this.$extendedSpans = o45Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            yd9.a(this.$content, this.$modifier, this.$style, this.$extendedSpans, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<sl8, j6g> {
        final /* synthetic */ pd9 $imageState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qd9 qd9Var) {
            super(1);
            this.$imageState = qd9Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(sl8 sl8Var) {
            sl8 sl8Var2 = sl8Var;
            sl8Var2.getClass();
            sl8 sl8VarU = sl8Var2.U();
            if (sl8VarU != null) {
                this.$imageState.b(sl8VarU.a());
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements wu5<String, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ pd9 $imageState;
        final /* synthetic */ o37 $transformer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o37 o37Var, qd9 qd9Var) {
            super(3);
            this.$transformer = o37Var;
            this.$imageState = qd9Var;
        }

        @Override // defpackage.wu5
        public final j6g q(String str, androidx.compose.runtime.b bVar, Integer num) {
            String str2 = str;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            str2.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.K(str2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && bVar2.i()) {
                bVar2.D();
            } else {
                this.$transformer.b(str2, bVar2);
            }
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<mif, j6g> {
        final /* synthetic */ g4a<mif> $layoutResult;
        final /* synthetic */ Function1<mif, j6g> $onTextLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(g4a<mif> g4aVar, Function1<? super mif, j6g> function1) {
            super(1);
            this.$layoutResult = g4aVar;
            this.$onTextLayout = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(mif mifVar) {
            mif mifVar2 = mifVar;
            mifVar2.getClass();
            this.$layoutResult.setValue(mifVar2);
            this.$onTextLayout.invoke(mifVar2);
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ le0 $content;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1<mif, j6g> $onTextLayout;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(le0 le0Var, androidx.compose.ui.e eVar, tjf tjfVar, Function1<? super mif, j6g> function1, int i, int i2) {
            super(2);
            this.$content = le0Var;
            this.$modifier = eVar;
            this.$style = tjfVar;
            this.$onTextLayout = function1;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            yd9.b(this.$content, this.$modifier, this.$style, this.$onTextLayout, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function1<mif, j6g> {
        final /* synthetic */ o45 $extendedSpans;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o45 o45Var) {
            super(1);
            this.$extendedSpans = o45Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(mif mifVar) {
            mif mifVar2 = mifVar;
            mifVar2.getClass();
            this.$extendedSpans.getClass();
            if (mifVar2.a.a.c(0, 0, "extended_spans_marker").isEmpty()) {
                throw new IllegalStateException("ExtendedSpans#extend(AnnotatedString) wasn't called for this Text().");
            }
            throw null;
        }
    }

    public static final class h extends mj8 implements Function1<mif, j6g> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(mif mifVar) {
            mifVar.getClass();
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements gu5<tab> {
        final /* synthetic */ pd9 $imageState;
        final /* synthetic */ o37 $transformer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(o37 o37Var, qd9 qd9Var) {
            super(0);
            this.$transformer = o37Var;
            this.$imageState = qd9Var;
        }

        @Override // defpackage.gu5
        public final tab invoke() {
            return this.$transformer.a(this.$imageState.getDensity(), this.$imageState.c(), this.$imageState.a());
        }
    }

    @uh3(c = "com.mikepenz.markdown.compose.elements.MarkdownTextKt$MarkdownText$textModifier$1$1", f = "MarkdownText.kt", l = {85}, m = "invokeSuspend")
    public static final class j extends c1f implements Function2<efb, lu2<? super j6g>, Object> {
        final /* synthetic */ le0 $content;
        final /* synthetic */ g4a<mif> $layoutResult;
        final /* synthetic */ ouc $referenceLinkHandler;
        final /* synthetic */ mhg $uriHandler;
        private /* synthetic */ Object L$0;
        int label;

        @uh3(c = "com.mikepenz.markdown.compose.elements.MarkdownTextKt$MarkdownText$textModifier$1$1$1", f = "MarkdownText.kt", l = {86, 98}, m = "invokeSuspend")
        public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            final /* synthetic */ le0 $content;
            final /* synthetic */ g4a<mif> $layoutResult;
            final /* synthetic */ ouc $referenceLinkHandler;
            final /* synthetic */ mhg $uriHandler;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g4a<mif> g4aVar, mhg mhgVar, le0 le0Var, ouc oucVar, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$layoutResult = g4aVar;
                this.$uriHandler = mhgVar;
                this.$content = le0Var;
                this.$referenceLinkHandler = oucVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.$layoutResult, this.$uriHandler, this.$content, this.$referenceLinkHandler, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                return ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    int r0 = r9.label
                    r1 = 2
                    r2 = 1
                    r3 = 0
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L23
                    if (r0 == r2) goto L1b
                    if (r0 != r1) goto L15
                    java.lang.Object r0 = r9.L$0
                    java.lang.String r0 = (java.lang.String) r0
                    defpackage.r7d.b(r10)
                    goto L7e
                L15:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r9)
                    return r3
                L1b:
                    java.lang.Object r0 = r9.L$0
                    l61 r0 = (defpackage.l61) r0
                    defpackage.r7d.b(r10)
                    goto L37
                L23:
                    defpackage.r7d.b(r10)
                    java.lang.Object r10 = r9.L$0
                    r0 = r10
                    l61 r0 = (defpackage.l61) r0
                    r9.L$0 = r0
                    r9.label = r2
                    r10 = 3
                    java.lang.Object r10 = defpackage.i8f.c(r0, r9, r10)
                    if (r10 != r4) goto L37
                    goto L7c
                L37:
                    yeb r10 = (defpackage.yeb) r10
                    long r5 = r10.c
                    g4a<mif> r2 = r9.$layoutResult
                    java.lang.Object r2 = r2.getValue()
                    mif r2 = (defpackage.mif) r2
                    if (r2 == 0) goto L6b
                    le0 r7 = r9.$content
                    ouc r8 = r9.$referenceLinkHandler
                    q1a r2 = r2.b
                    int r2 = r2.g(r5)
                    java.lang.String r5 = "MARKDOWN_URL"
                    java.util.List r2 = r7.c(r2, r2, r5)
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.List r2 = defpackage.z92.i1(r2)
                    java.lang.Object r2 = defpackage.z92.Q0(r2)
                    le0$c r2 = (le0.c) r2
                    if (r2 == 0) goto L6b
                    T r2 = r2.a
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.String r3 = r8.b(r2)
                L6b:
                    if (r3 == 0) goto L96
                    r10.a()
                    r9.L$0 = r3
                    r9.label = r1
                    peb r10 = defpackage.peb.b
                    java.lang.Object r10 = defpackage.i8f.i(r0, r10, r9)
                    if (r10 != r4) goto L7d
                L7c:
                    return r4
                L7d:
                    r0 = r3
                L7e:
                    yeb r10 = (defpackage.yeb) r10
                    if (r10 == 0) goto L96
                    r10.a()
                    mhg r9 = r9.$uriHandler     // Catch: java.lang.Throwable -> L8b
                    r9.a(r0)     // Catch: java.lang.Throwable -> L8b
                    goto L96
                L8b:
                    java.lang.String r9 = "Could not open the provided url: "
                    java.lang.String r9 = defpackage.l5.l(r9, r0)
                    java.io.PrintStream r10 = java.lang.System.out
                    r10.println(r9)
                L96:
                    j6g r9 = defpackage.j6g.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: yd9.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(g4a<mif> g4aVar, mhg mhgVar, le0 le0Var, ouc oucVar, lu2<? super j> lu2Var) {
            super(2, lu2Var);
            this.$layoutResult = g4aVar;
            this.$uriHandler = mhgVar;
            this.$content = le0Var;
            this.$referenceLinkHandler = oucVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            j jVar = new j(this.$layoutResult, this.$uriHandler, this.$content, this.$referenceLinkHandler, lu2Var);
            jVar.L$0 = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            return ((j) create(efbVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                efb efbVar = (efb) this.L$0;
                a aVar = new a(this.$layoutResult, this.$uriHandler, this.$content, this.$referenceLinkHandler, null);
                this.label = 1;
                Object objC = ap5.c(efbVar, aVar, this);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.le0 r24, androidx.compose.ui.e r25, defpackage.tjf r26, defpackage.o45 r27, androidx.compose.runtime.b r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd9.a(le0, androidx.compose.ui.e, tjf, o45, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.le0 r27, androidx.compose.ui.e r28, defpackage.tjf r29, kotlin.jvm.functions.Function1<? super defpackage.mif, defpackage.j6g> r30, androidx.compose.runtime.b r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd9.b(le0, androidx.compose.ui.e, tjf, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(String str, androidx.compose.ui.e eVar, tjf tjfVar, androidx.compose.runtime.b bVar, int i2, int i3) {
        int i4;
        androidx.compose.ui.e eVar2;
        tjf tjfVar2;
        str.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-708519294);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cVarH.K(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && cVarH.K(tjfVar)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i4 & 147) == 146 && cVarH.i()) {
            cVarH.D();
            tjfVar2 = tjfVar;
            eVar2 = eVar;
        } else {
            cVarH.v0();
            if ((i2 & 1) == 0 || cVarH.c0()) {
                if (i5 != 0) {
                    eVar = e.a.b;
                }
                if ((i3 & 4) != 0) {
                    tjfVar = ((ae9) cVarH.M(rk2.e)).getText();
                    i4 &= -897;
                }
                androidx.compose.ui.e eVar3 = eVar;
                tjf tjfVar3 = tjfVar;
                cVarH.V();
                a(new le0(6, str, null), eVar3, tjfVar3, null, cVarH, i4 & 1008, 8);
                eVar2 = eVar3;
                tjfVar2 = tjfVar3;
            } else {
                cVarH.D();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                androidx.compose.ui.e eVar32 = eVar;
                tjf tjfVar32 = tjfVar;
                cVarH.V();
                a(new le0(6, str, null), eVar32, tjfVar32, null, cVarH, i4 & 1008, 8);
                eVar2 = eVar32;
                tjfVar2 = tjfVar32;
            }
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(str, eVar2, tjfVar2, i2, i3);
        }
    }
}
