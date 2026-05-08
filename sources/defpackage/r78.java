package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.r78;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r78 {

    @uh3(c = "com.indeed.android.profile.screens.sheets.preferences.JobTitlePreferencesFlow_ktKt$JobTitlePreferenceFlow$3$1$1$1$1", f = "JobTitlePreferencesFlow.kt.kt", l = {155, 158}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<sm5> $listItemFocusRequester;
        final /* synthetic */ g4a<List<String>> $preferredJobTitles$delegate;
        final /* synthetic */ g4a<String> $restoreItemFocus$delegate;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, g4a g4aVar, g4a g4aVar2, List list) {
            super(2, lu2Var);
            this.$restoreItemFocus$delegate = g4aVar;
            this.$preferredJobTitles$delegate = g4aVar2;
            this.$listItemFocusRequester = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$restoreItemFocus$delegate, this.$preferredJobTitles$delegate, this.$listItemFocusRequester);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        
            if (defpackage.ly9.a(getContext()).W(r6, r10) == r5) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v1, types: [ese] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 0
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L32
                if (r0 == r4) goto L20
                if (r0 != r3) goto L1a
                java.lang.Object r0 = r10.L$0
                g4a r0 = (defpackage.g4a) r0
                defpackage.r7d.b(r11)     // Catch: java.lang.Exception -> L17
                goto Lab
            L17:
                r11 = move-exception
                goto L8e
            L1a:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                return r1
            L20:
                int r0 = r10.I$1
                int r4 = r10.I$0
                java.lang.Object r6 = r10.L$1
                g4a r6 = (defpackage.g4a) r6
                java.lang.Object r7 = r10.L$0
                java.util.List r7 = (java.util.List) r7
                defpackage.r7d.b(r11)
                r11 = r0
                r0 = r6
                goto L70
            L32:
                defpackage.r7d.b(r11)
                g4a<java.lang.String> r11 = r10.$restoreItemFocus$delegate
                java.lang.Object r11 = r11.getValue()
                java.lang.String r11 = (java.lang.String) r11
                boolean r11 = defpackage.v1c.h(r11)
                if (r11 == 0) goto Lb2
                g4a<java.util.List<java.lang.String>> r11 = r10.$preferredJobTitles$delegate
                java.lang.Object r11 = r11.getValue()
                java.util.List r11 = (java.util.List) r11
                g4a<java.lang.String> r0 = r10.$restoreItemFocus$delegate
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                int r11 = r11.indexOf(r0)
                java.util.List<sm5> r7 = r10.$listItemFocusRequester
                g4a<java.lang.String> r0 = r10.$restoreItemFocus$delegate
                r10.L$0 = r7
                r10.L$1 = r0
                r10.I$0 = r11
                r10.I$1 = r2
                r10.label = r4
                r8 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r4 = defpackage.ls3.b(r8, r10)
                if (r4 != r5) goto L6e
                goto L8d
            L6e:
                r4 = r11
                r11 = r2
            L70:
                q78 r6 = new q78     // Catch: java.lang.Exception -> L17
                r6.<init>()     // Catch: java.lang.Exception -> L17
                r10.L$0 = r0     // Catch: java.lang.Exception -> L17
                r10.L$1 = r1     // Catch: java.lang.Exception -> L17
                r10.I$0 = r4     // Catch: java.lang.Exception -> L17
                r10.I$1 = r11     // Catch: java.lang.Exception -> L17
                r10.label = r3     // Catch: java.lang.Exception -> L17
                v03 r11 = r10.getContext()     // Catch: java.lang.Exception -> L17
                ky9 r11 = defpackage.ly9.a(r11)     // Catch: java.lang.Exception -> L17
                java.lang.Object r11 = r11.W(r6, r10)     // Catch: java.lang.Exception -> L17
                if (r11 != r5) goto Lab
            L8d:
                return r5
            L8e:
                java.util.ArrayList r1 = defpackage.lz2.a
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Error focusing job title item: "
                r1.<init>(r3)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "JobTitlePreferenceFlow"
                defpackage.lz2.b(r1, r0, r2, r11)
                j6g r11 = defpackage.j6g.a
            Lab:
                g4a<java.lang.String> r10 = r10.$restoreItemFocus$delegate
                java.lang.String r11 = ""
                r10.setValue(r11)
            Lb2:
                j6g r10 = defpackage.j6g.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: r78.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.sheets.preferences.JobTitlePreferencesFlow_ktKt$JobTitlePreferenceFlow$3$1$1$2$1", f = "JobTitlePreferencesFlow.kt.kt", l = {177, 180}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $addProfileInfoFocusRequester;
        final /* synthetic */ g4a<Boolean> $restoreAddDesiredFocus$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lu2 lu2Var, sm5 sm5Var, g4a g4aVar) {
            super(2, lu2Var);
            this.$restoreAddDesiredFocus$delegate = g4aVar;
            this.$addProfileInfoFocusRequester = sm5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(lu2Var, this.$addProfileInfoFocusRequester, this.$restoreAddDesiredFocus$delegate);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        
            if (defpackage.ly9.a(getContext()).W(r0, r6) == r3) goto L20;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L1d
                if (r0 == r2) goto L19
                if (r0 != r1) goto L12
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L10
                goto L5c
            L10:
                r7 = move-exception
                goto L52
            L12:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                r6 = 0
                return r6
            L19:
                defpackage.r7d.b(r7)
                goto L39
            L1d:
                defpackage.r7d.b(r7)
                g4a<java.lang.Boolean> r7 = r6.$restoreAddDesiredFocus$delegate
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L63
                r6.label = r2
                r4 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r7 = defpackage.ls3.b(r4, r6)
                if (r7 != r3) goto L39
                goto L51
            L39:
                sm5 r7 = r6.$addProfileInfoFocusRequester     // Catch: java.lang.Exception -> L10
                fj r0 = new fj     // Catch: java.lang.Exception -> L10
                r2 = 7
                r0.<init>(r7, r2)     // Catch: java.lang.Exception -> L10
                r6.label = r1     // Catch: java.lang.Exception -> L10
                v03 r7 = r6.getContext()     // Catch: java.lang.Exception -> L10
                ky9 r7 = defpackage.ly9.a(r7)     // Catch: java.lang.Exception -> L10
                java.lang.Object r7 = r7.W(r0, r6)     // Catch: java.lang.Exception -> L10
                if (r7 != r3) goto L5c
            L51:
                return r3
            L52:
                java.util.ArrayList r0 = defpackage.lz2.a
                java.lang.String r0 = "JobTitlePreferenceFlow"
                java.lang.String r1 = "Error focusing add desired button"
                r2 = 0
                defpackage.lz2.b(r0, r1, r2, r7)
            L5c:
                g4a<java.lang.Boolean> r6 = r6.$restoreAddDesiredFocus$delegate
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r6.setValue(r7)
            L63:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r78.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ ew b;

        public c(iba ibaVar, ew ewVar) {
            this.a = ibaVar;
            this.b = ewVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            iba ibaVar = this.a;
            ibaVar.getClass();
            ibaVar.q.remove(this.b);
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            dg3.i(r78.b(f78.b));
            dg3.i(r78.b(f78.a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List<String> list, final Function2<? super Boolean, ? super List<String>, j6g> function2, final gu5<j6g> gu5Var, final t41 t41Var, final b5g b5gVar, final hw9 hw9Var, androidx.compose.runtime.b bVar, final int i) {
        androidx.compose.runtime.c cVar;
        sm5 sm5Var;
        final boolean z;
        sm5 sm5Var2;
        final iba ibaVar;
        function2.getClass();
        gu5Var.getClass();
        t41Var.getClass();
        b5gVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(966231753);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(function2) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(t41Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 16384 : 8192) | (cVarH.x(hw9Var) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            iba ibaVarB = q92.B(new s[0], cVarH);
            final String strI = ak2.I(R.string.job_title_preferences_sheet_header, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.valueOf(!list.isEmpty()));
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            boolean z2 = !list.isEmpty();
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(list);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f("");
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(Boolean.FALSE);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f("");
                cVarH.p(objV5);
            }
            final g4a g4aVar5 = (g4a) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = r.f(Boolean.FALSE);
                cVarH.p(objV6);
            }
            final g4a g4aVar6 = (g4a) objV6;
            boolean zD = cVarH.d(((List) g4aVar2.getValue()).size());
            Object objV7 = cVarH.v();
            if (zD || objV7 == c0020a) {
                int size = ((List) g4aVar2.getValue()).size();
                ArrayList arrayList = new ArrayList(size);
                int i3 = 0;
                while (i3 < size) {
                    arrayList.add(new sm5());
                    i3++;
                    size = size;
                }
                cVarH.p(arrayList);
                objV7 = arrayList;
            }
            final List list2 = (List) objV7;
            Object objV8 = cVarH.v();
            if (objV8 == c0020a) {
                objV8 = new sm5();
                cVarH.p(objV8);
            }
            sm5 sm5Var3 = (sm5) objV8;
            if (wl7.b((List) g4aVar2.getValue(), list) && ((Boolean) g4aVar.getValue()).booleanValue() == z2) {
                sm5Var = sm5Var3;
                z = false;
            } else {
                sm5Var = sm5Var3;
                z = true;
            }
            boolean zX = cVarH.x(ibaVarB);
            Object objV9 = cVarH.v();
            if (zX || objV9 == c0020a) {
                objV9 = new bh4(ibaVarB, 1);
                cVarH.p(objV9);
            }
            to4.b(ibaVarB, (Function1) objV9, cVarH);
            j6g j6gVar = j6g.a;
            Object objV10 = cVarH.v();
            if (objV10 == c0020a) {
                sm5Var2 = sm5Var;
                objV10 = new md1(4);
                cVarH.p(objV10);
            } else {
                sm5Var2 = sm5Var;
            }
            to4.b(j6gVar, (Function1) objV10, cVarH);
            boolean zX2 = cVarH.x(list2) | cVarH.K(strI) | cVarH.a(z) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | cVarH.x(ibaVarB) | cVarH.x(t41Var) | ((i2 & 458752) == 131072 || cVarH.x(hw9Var));
            Object objV11 = cVarH.v();
            if (zX2 || objV11 == c0020a) {
                ibaVar = ibaVarB;
                final sm5 sm5Var4 = sm5Var2;
                objV11 = new Function1() { // from class: n78
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final List list3 = list2;
                        final String str = strI;
                        final boolean z3 = z;
                        final gu5 gu5Var2 = gu5Var;
                        final Function2 function22 = function2;
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar7 = g4aVar;
                        final g4a g4aVar8 = g4aVar2;
                        final g4a g4aVar9 = g4aVar5;
                        final g4a g4aVar10 = g4aVar6;
                        final sm5 sm5Var5 = sm5Var4;
                        final g4a g4aVar11 = g4aVar4;
                        final iba ibaVar2 = ibaVar;
                        final g4a g4aVar12 = g4aVar3;
                        hba.a(gbaVar, "DESIRED_JOB_TITLES", new ah2(355743532, new xu5() { // from class: p78
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                final g4a g4aVar13 = g4aVar7;
                                boolean zBooleanValue = ((Boolean) g4aVar13.getValue()).booleanValue();
                                final g4a g4aVar14 = g4aVar8;
                                boolean z4 = (zBooleanValue && !((List) g4aVar14.getValue()).isEmpty()) || !((Boolean) g4aVar13.getValue()).booleanValue();
                                g4a g4aVar15 = g4aVar9;
                                String str2 = (String) g4aVar15.getValue();
                                final List list4 = list3;
                                boolean zX3 = bVar2.x(list4);
                                Object objV12 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                gu5 gu5Var3 = null;
                                if (zX3 || objV12 == c0020a2) {
                                    objV12 = new r78.a(null, g4aVar15, g4aVar14, list4);
                                    bVar2.p(objV12);
                                }
                                to4.d(bVar2, str2, (Function2) objV12);
                                g4a g4aVar16 = g4aVar10;
                                Boolean bool = (Boolean) g4aVar16.getValue();
                                bool.getClass();
                                Object objV13 = bVar2.v();
                                final sm5 sm5Var6 = sm5Var5;
                                if (objV13 == c0020a2) {
                                    objV13 = new r78.b(null, sm5Var6, g4aVar16);
                                    bVar2.p(objV13);
                                }
                                to4.d(bVar2, bool, (Function2) objV13);
                                boolean z5 = z3;
                                boolean zA = bVar2.a(z5);
                                final gu5 gu5Var4 = gu5Var2;
                                boolean zK = zA | bVar2.K(gu5Var4);
                                Object objV14 = bVar2.v();
                                final g4a g4aVar17 = g4aVar11;
                                if (zK || objV14 == c0020a2) {
                                    objV14 = new k78(z5, gu5Var4, g4aVar17, 0);
                                    bVar2.p(objV14);
                                }
                                gu5 gu5Var5 = (gu5) objV14;
                                final Function2 function23 = function22;
                                if (z4) {
                                    bVar2.L(-2021410037);
                                    boolean zK2 = bVar2.K(function23);
                                    Object objV15 = bVar2.v();
                                    if (zK2 || objV15 == c0020a2) {
                                        objV15 = new nw0(4, function23, g4aVar13, g4aVar14);
                                        bVar2.p(objV15);
                                    }
                                    gu5Var3 = (gu5) objV15;
                                    bVar2.F();
                                } else {
                                    bVar2.L(-2021053878);
                                    bVar2.F();
                                }
                                gu5 gu5Var6 = gu5Var3;
                                final b5g b5gVar3 = b5gVar2;
                                final iba ibaVar3 = ibaVar2;
                                final g4a g4aVar18 = g4aVar12;
                                sb1.a(str, gu5Var5, gu5Var6, 0, null, 0, null, null, b5gVar3, false, false, false, false, null, 0, bh2.c(-1763764054, new Function2() { // from class: l78
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        b bVar3 = (b) obj6;
                                        int iIntValue = ((Integer) obj7).intValue();
                                        if (bVar3.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            ag9 ag9VarD = hl1.d(c20.a.a, false);
                                            int iHashCode = Long.hashCode(bVar3.k());
                                            t8b t8bVarM = bVar3.m();
                                            e.a aVar = e.a.b;
                                            e eVarC = c.c(bVar3, aVar);
                                            gl2.j.getClass();
                                            pm8.a aVar2 = gl2.a.b;
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar2);
                                            } else {
                                                bVar3.n();
                                            }
                                            gl2.a.d dVar = gl2.a.g;
                                            ygg.y(bVar3, ag9VarD, dVar);
                                            gl2.a.f fVar = gl2.a.f;
                                            ygg.y(bVar3, t8bVarM, fVar);
                                            gl2.a.C0251a c0251a = gl2.a.j;
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                                uz.g(iHashCode, bVar3, iHashCode, c0251a);
                                            }
                                            gl2.a.e eVar = gl2.a.d;
                                            ygg.y(bVar3, eVarC, eVar);
                                            e eVarM = pnb.M(f.h(g.f(aVar, 1.0f), v1c.e, 0.0f, 2), pnb.L(0, 1, bVar3), true);
                                            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                                            int iHashCode2 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM2 = bVar3.m();
                                            e eVarC2 = c.c(bVar3, eVarM);
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar2);
                                            } else {
                                                bVar3.n();
                                            }
                                            ygg.y(bVar3, ob2VarA, dVar);
                                            ygg.y(bVar3, t8bVarM2, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                                uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                                            }
                                            ygg.y(bVar3, eVarC2, eVar);
                                            g4a g4aVar19 = g4aVar13;
                                            boolean zBooleanValue2 = ((Boolean) g4aVar19.getValue()).booleanValue();
                                            g4a g4aVar20 = g4aVar14;
                                            List list5 = (List) g4aVar20.getValue();
                                            Object objV16 = bVar3.v();
                                            b.a.C0020a c0020a3 = b.a.a;
                                            if (objV16 == c0020a3) {
                                                objV16 = new ns(4, g4aVar19);
                                                bVar3.p(objV16);
                                            }
                                            Function1 function1 = (Function1) objV16;
                                            iba ibaVar4 = ibaVar3;
                                            boolean zX4 = bVar3.x(ibaVar4);
                                            Object objV17 = bVar3.v();
                                            g4a g4aVar21 = g4aVar18;
                                            if (zX4 || objV17 == c0020a3) {
                                                objV17 = new m78(ibaVar4, g4aVar21, 0);
                                                bVar3.p(objV17);
                                            }
                                            gu5 gu5Var7 = (gu5) objV17;
                                            boolean zX5 = bVar3.x(ibaVar4);
                                            Object objV18 = bVar3.v();
                                            if (zX5 || objV18 == c0020a3) {
                                                objV18 = new ny(ibaVar4, g4aVar21, 1);
                                                bVar3.p(objV18);
                                            }
                                            Function1 function12 = (Function1) objV18;
                                            Object objV19 = bVar3.v();
                                            if (objV19 == c0020a3) {
                                                objV19 = new mb(4, g4aVar20);
                                                bVar3.p(objV19);
                                            }
                                            hic.d(zBooleanValue2, list5, function1, gu5Var7, function12, (Function1) objV19, list4, sm5Var6, bVar3, 102239616);
                                            jh2.f(bVar3, g.h(aVar, v1c.d));
                                            bVar3.q();
                                            g4a g4aVar22 = g4aVar17;
                                            if (((Boolean) g4aVar22.getValue()).booleanValue()) {
                                                bVar3.L(-60308166);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-job-title-preference", "confirmation-alert", sp7.c.a.a, null, null, 24));
                                                Object objV20 = bVar3.v();
                                                if (objV20 == c0020a3) {
                                                    objV20 = new bw(2, g4aVar22);
                                                    bVar3.p(objV20);
                                                }
                                                gu5 gu5Var8 = (gu5) objV20;
                                                gu5 gu5Var9 = gu5Var4;
                                                boolean zK3 = bVar3.K(gu5Var9);
                                                Object objV21 = bVar3.v();
                                                if (zK3 || objV21 == c0020a3) {
                                                    objV21 = new q61(6, gu5Var9, g4aVar22);
                                                    bVar3.p(objV21);
                                                }
                                                r03.e(gu5Var8, (gu5) objV21, bVar3, 6);
                                            } else {
                                                bVar3.L(-72423214);
                                            }
                                            bVar3.F();
                                            if (b5gVar3 == b5g.c) {
                                                bVar3.L(-59552355);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-job-title-preference", "error-toast", sp7.c.a.c, null, null, 24));
                                                Function2 function24 = function23;
                                                boolean zK4 = bVar3.K(function24);
                                                Object objV22 = bVar3.v();
                                                if (zK4 || objV22 == c0020a3) {
                                                    objV22 = new s02(3, function24, g4aVar19, g4aVar20);
                                                    bVar3.p(objV22);
                                                }
                                                rg0.a((gu5) objV22, bVar3, 0);
                                            } else {
                                                bVar3.L(-72423214);
                                            }
                                            bVar3.F();
                                            bVar3.q();
                                        } else {
                                            bVar3.D();
                                        }
                                        return j6g.a;
                                    }
                                }, bVar2), bVar2, 0, 196608, 32504);
                                return j6g.a;
                            }
                        }, true));
                        hba.a(gbaVar, "JOB_TITLE_AUTOCOMPLETE", new ah2(-915207965, new zu(t41Var, str, gu5Var2, ibaVar2, hw9Var, g4aVar12, g4aVar8, g4aVar7, g4aVar10, g4aVar9), true));
                        return j6g.a;
                    }
                };
                cVarH.p(objV11);
            } else {
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "DESIRED_JOB_TITLES", null, null, null, null, null, null, null, null, (Function1) objV11, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, function2, gu5Var, t41Var, b5gVar, hw9Var, i) { // from class: o78
                public final /* synthetic */ List a;
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ t41 d;
                public final /* synthetic */ b5g e;
                public final /* synthetic */ hw9 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(262145);
                    r78.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final String b(f78 f78Var) {
        int iOrdinal = f78Var.ordinal();
        pjb pjbVar = pjb.a;
        rxb rxbVar = rxb.b;
        if (iOrdinal == 0) {
            return dg3.b(rxbVar, pjbVar, null, "Edit", 4);
        }
        if (iOrdinal == 1) {
            return dg3.a(rxbVar, pjbVar, f78.b, "");
        }
        l.g();
        return null;
    }
}
