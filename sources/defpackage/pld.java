package defpackage;

import android.util.Log;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.myjobs.data.model.APIError;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.hf3;
import defpackage.wz5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pld extends xb1<old, c> {
    public final sx3 V;
    public final dfg W;
    public final x46 X;
    public final wz5 Y;
    public final g26 Z;
    public final bkd a0;
    public final s0a b0;
    public final k36 c0;
    public final e16 d0;
    public final a06 e0;
    public final okd f;
    public final x29 f0;
    public final c39 g0;
    public long h0;
    public boolean i0;
    public int j0 = -1;
    public final nde k0;
    public final pqc l0;

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$1", f = "SavedTabViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: pld$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$1$1", f = "SavedTabViewModel.kt", l = {296, 296}, m = "invokeSuspend")
        public static final class C0385a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ pld this$0;

            /* JADX INFO: renamed from: pld$a$a$a, reason: collision with other inner class name */
            public static final class C0386a<T> implements wi5 {
                public final /* synthetic */ pld a;

                public C0386a(pld pldVar) {
                    this.a = pldVar;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    List list = (List) obj;
                    pld pldVar = this.a;
                    pldVar.k(new m72(7, pldVar, list));
                    Function1<lx5, j6g> function1 = c05.a;
                    c05.e(list.size(), "nonIagrp2");
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0385a(pld pldVar, lu2<? super C0385a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = pldVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0385a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0385a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
            
                if (((defpackage.vi5) r5).e(r0, r4) != r3) goto L21;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r4.label
                    r1 = 2
                    r2 = 1
                    g13 r3 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r2) goto L17
                    if (r0 != r1) goto L10
                    defpackage.r7d.b(r5)
                    goto L55
                L10:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L17:
                    defpackage.r7d.b(r5)
                    goto L43
                L1b:
                    defpackage.r7d.b(r5)
                    lr7 r5 = defpackage.i6a.d()
                    int r5 = r5.a
                    if (r5 != r1) goto L55
                    boolean r5 = defpackage.i6a.p()
                    if (r5 != 0) goto L55
                    pld r5 = r4.this$0
                    g26 r5 = r5.Z
                    j6g r0 = defpackage.j6g.a
                    r4.label = r2
                    f88 r5 = r5.a
                    rqc r5 = r5.z()
                    f26 r0 = new f26
                    r0.<init>(r5)
                    if (r0 != r3) goto L42
                    goto L54
                L42:
                    r5 = r0
                L43:
                    vi5 r5 = (defpackage.vi5) r5
                    pld$a$a$a r0 = new pld$a$a$a
                    pld r2 = r4.this$0
                    r0.<init>(r2)
                    r4.label = r1
                    java.lang.Object r4 = r5.e(r0, r4)
                    if (r4 != r3) goto L55
                L54:
                    return r3
                L55:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: pld.a.C0385a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$1$2", f = "SavedTabViewModel.kt", l = {303, 303}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ pld this$0;

            /* JADX INFO: renamed from: pld$a$b$a, reason: collision with other inner class name */
            public static final class C0387a<T> implements wi5 {
                public final /* synthetic */ pld a;

                public C0387a(pld pldVar) {
                    this.a = pldVar;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    int i;
                    List list = (List) obj;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            UserJobStatus userJobStatus = ((SavedJobsDto) it2.next()).getUserJobStatus();
                            if (userJobStatus != null && jCurrentTimeMillis - userJobStatus.getTimestamp() <= 1209600000 && (i = i + 1) < 0) {
                                u63.n0();
                                throw null;
                            }
                        }
                    }
                    int i2 = i > 0 ? 1 : 0;
                    pld pldVar = this.a;
                    pldVar.getClass();
                    pldVar.i().getClass();
                    old oldVarA = old.a(pldVar.i(), arrayList, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, i2, 131070);
                    gse gseVar = pldVar.b;
                    gseVar.getClass();
                    gseVar.m(null, oldVarA);
                    if (pldVar.i0) {
                        List list3 = list;
                        if (list3.size() != pldVar.j0) {
                            Function1<lx5, j6g> function1 = c05.a;
                            c05.d(list3.size(), "Saved");
                            pldVar.j0 = list3.size();
                        }
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(pld pldVar, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = pldVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (((defpackage.vi5) r5).e(r0, r4) == r3) goto L15;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r4.label
                    r1 = 2
                    r2 = 1
                    g13 r3 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r2) goto L17
                    if (r0 != r1) goto L10
                    defpackage.r7d.b(r5)
                    goto L41
                L10:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L17:
                    defpackage.r7d.b(r5)
                    goto L2f
                L1b:
                    defpackage.r7d.b(r5)
                    pld r5 = r4.this$0
                    x46 r5 = r5.X
                    j6g r0 = defpackage.j6g.a
                    r4.label = r2
                    f88 r5 = r5.a
                    rqc r5 = r5.o()
                    if (r5 != r3) goto L2f
                    goto L40
                L2f:
                    vi5 r5 = (defpackage.vi5) r5
                    pld$a$b$a r0 = new pld$a$b$a
                    pld r2 = r4.this$0
                    r0.<init>(r2)
                    r4.label = r1
                    java.lang.Object r4 = r5.e(r0, r4)
                    if (r4 != r3) goto L41
                L40:
                    return r3
                L41:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: pld.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = pld.this.new a(lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(e13Var, null, null, new C0385a(pld.this, null), 3);
            u63.Y(e13Var, null, null, new b(pld.this, null), 3);
            return j6g.a;
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return akb.k("NavigateToEbaAd(url=", this.a, ", from=", this.b, ")");
            }
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$loadBrandedAd$1", f = "SavedTabViewModel.kt", l = {490, 497}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$loadBrandedAd$1$1", f = "SavedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<BrandedAdsDto>, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ pld this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pld pldVar, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = pldVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                a aVar = new a(this.this$0, lu2Var);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<BrandedAdsDto> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                hf3 hf3Var = (hf3) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (hf3Var instanceof hf3.c) {
                    BrandedAdsDto brandedAdsDto = (BrandedAdsDto) ((hf3.c) hf3Var).a;
                    boolean zB = wl7.b(brandedAdsDto.getCreativeKeyval(), this.this$0.i().m);
                    pld pldVar = this.this$0;
                    if (zB) {
                        pldVar.i();
                        pldVar.b.setValue(old.a(pldVar.i(), null, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 229375));
                    } else {
                        pldVar.i();
                        pldVar.b.setValue(old.a(pldVar.i(), null, null, false, 0, null, null, false, null, false, brandedAdsDto, false, null, brandedAdsDto.getCreativeKeyval(), false, false, 0, 210943));
                    }
                } else if (hf3Var instanceof hf3.a) {
                    ArrayList arrayList = lz2.a;
                    APIError aPIError = ((hf3.a) hf3Var).a;
                    lz2.c("SavedTabViewModel", l5.l("Error loading branded ads: ", aPIError != null ? aPIError.getMessage() : null), false, null, 8);
                } else {
                    if (!(hf3Var instanceof hf3.b)) {
                        l.g();
                        return null;
                    }
                    ArrayList arrayList2 = lz2.a;
                    Log.d("SavedTabViewModel", "Branded ads loading", null);
                }
                return j6g.a;
            }
        }

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pld.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r9, r0, r8) == r4) goto L18;
         */
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
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L54
                goto L5f
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r1
            L17:
                defpackage.r7d.b(r9)     // Catch: java.lang.Exception -> L54
                goto L42
            L1b:
                defpackage.r7d.b(r9)
                pld r9 = defpackage.pld.this     // Catch: java.lang.Exception -> L54
                a06 r9 = r9.e0     // Catch: java.lang.Exception -> L54
                a06$a r0 = new a06$a     // Catch: java.lang.Exception -> L54
                com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams r5 = new com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams     // Catch: java.lang.Exception -> L54
                java.lang.String r6 = "mobapptrackersavedbottom"
                java.lang.String r7 = "native"
                r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L54
                r0.<init>(r5)     // Catch: java.lang.Exception -> L54
                r8.label = r3     // Catch: java.lang.Exception -> L54
                r9.getClass()     // Catch: java.lang.Exception -> L54
                b06 r3 = new b06     // Catch: java.lang.Exception -> L54
                r3.<init>(r9, r0, r1)     // Catch: java.lang.Exception -> L54
                kjd r9 = new kjd     // Catch: java.lang.Exception -> L54
                r9.<init>(r3)     // Catch: java.lang.Exception -> L54
                if (r9 != r4) goto L42
                goto L53
            L42:
                vi5 r9 = (defpackage.vi5) r9     // Catch: java.lang.Exception -> L54
                pld$d$a r0 = new pld$d$a     // Catch: java.lang.Exception -> L54
                pld r3 = defpackage.pld.this     // Catch: java.lang.Exception -> L54
                r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L54
                r8.label = r2     // Catch: java.lang.Exception -> L54
                java.lang.Object r8 = defpackage.wg2.q(r9, r0, r8)     // Catch: java.lang.Exception -> L54
                if (r8 != r4) goto L5f
            L53:
                return r4
            L54:
                r8 = move-exception
                java.util.ArrayList r9 = defpackage.lz2.a
                java.lang.String r9 = "SavedTabViewModel"
                java.lang.String r0 = "Exception in branded ads data handling"
                r1 = 0
                defpackage.lz2.b(r9, r0, r1, r8)
            L5f:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pld.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$loadData$1", f = "SavedTabViewModel.kt", l = {335, 334}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $isActiveTab;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$isActiveTab = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pld.this.new e(this.$isActiveTab, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r4, r8, r21) == r5) goto L24;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r1 = r21
                int r0 = r1.label
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L26
                if (r0 == r4) goto L1c
                if (r0 != r3) goto L16
                defpackage.r7d.b(r22)     // Catch: java.lang.Exception -> L14
                goto Lb6
            L14:
                r0 = move-exception
                goto L76
            L16:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                return r2
            L1c:
                java.lang.Object r0 = r1.L$0
                pld r0 = (defpackage.pld) r0
                defpackage.r7d.b(r22)     // Catch: java.lang.Exception -> L14
                r4 = r22
                goto L5d
            L26:
                defpackage.r7d.b(r22)
                pld r0 = defpackage.pld.this     // Catch: java.lang.Exception -> L14
                okd r6 = r0.f     // Catch: java.lang.Exception -> L14
                okd$a r7 = new okd$a     // Catch: java.lang.Exception -> L14
                long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L14
                r10 = 15552000000(0x39ef8b000, double:7.683708924E-314)
                long r8 = r8 - r10
                rqc r10 = defpackage.v0b.b     // Catch: java.lang.Exception -> L14
                fse<T> r10 = r10.a     // Catch: java.lang.Exception -> L14
                java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L14
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L14
                if (r10 != 0) goto L47
                java.lang.String r10 = defpackage.ie7.Z     // Catch: java.lang.Exception -> L14
            L47:
                r7.<init>(r8, r10)     // Catch: java.lang.Exception -> L14
                r1.L$0 = r0     // Catch: java.lang.Exception -> L14
                r1.label = r4     // Catch: java.lang.Exception -> L14
                r6.getClass()     // Catch: java.lang.Exception -> L14
                pkd r4 = new pkd     // Catch: java.lang.Exception -> L14
                r4.<init>(r6, r7, r2)     // Catch: java.lang.Exception -> L14
                a22 r4 = defpackage.wg2.n(r4)     // Catch: java.lang.Exception -> L14
                if (r4 != r5) goto L5d
                goto L75
            L5d:
                vi5 r4 = (defpackage.vi5) r4     // Catch: java.lang.Exception -> L14
                pld r6 = defpackage.pld.this     // Catch: java.lang.Exception -> L14
                boolean r7 = r1.$isActiveTab     // Catch: java.lang.Exception -> L14
                sld r8 = new sld     // Catch: java.lang.Exception -> L14
                r8.<init>()     // Catch: java.lang.Exception -> L14
                r1.L$0 = r2     // Catch: java.lang.Exception -> L14
                r1.label = r3     // Catch: java.lang.Exception -> L14
                r0.getClass()     // Catch: java.lang.Exception -> L14
                java.lang.Object r0 = defpackage.xb1.g(r4, r8, r1)     // Catch: java.lang.Exception -> L14
                if (r0 != r5) goto Lb6
            L75:
                return r5
            L76:
                pld r1 = defpackage.pld.this
                xo6 r2 = r1.i()
                old r2 = (defpackage.old) r2
                xo6 r2 = r1.i()
                r3 = r2
                old r3 = (defpackage.old) r3
                com.indeed.android.myjobs.data.model.APIError r11 = new com.indeed.android.myjobs.data.model.APIError
                r2 = -1
                java.lang.String r4 = "Something went wrong"
                r11.<init>(r2, r4)
                r19 = 0
                r20 = 261759(0x3fe7f, float:3.66802E-40)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                old r2 = defpackage.old.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                gse r1 = r1.b
                r1.setValue(r2)
                java.util.ArrayList r1 = defpackage.lz2.a
                java.lang.String r1 = "Exception in Data handling"
                r2 = 0
                java.lang.String r3 = "SavedTabViewModel"
                defpackage.lz2.b(r3, r1, r2, r0)
            Lb6:
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pld.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$loadData$2", f = "SavedTabViewModel.kt", l = {388, 387}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        Object L$0;
        int label;

        public f(lu2<? super f> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pld.this.new f(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r8, r5, r7) == r4) goto L19;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L55
                goto L60
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r1
            L17:
                java.lang.Object r0 = r7.L$0
                pld r0 = (defpackage.pld) r0
                defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L55
                goto L3c
            L1f:
                defpackage.r7d.b(r8)
                pld r0 = defpackage.pld.this     // Catch: java.lang.Exception -> L55
                e16 r8 = r0.d0     // Catch: java.lang.Exception -> L55
                j6g r5 = defpackage.j6g.a     // Catch: java.lang.Exception -> L55
                r7.L$0 = r0     // Catch: java.lang.Exception -> L55
                r7.label = r3     // Catch: java.lang.Exception -> L55
                r8.getClass()     // Catch: java.lang.Exception -> L55
                f16 r3 = new f16     // Catch: java.lang.Exception -> L55
                r3.<init>(r8, r1)     // Catch: java.lang.Exception -> L55
                kjd r8 = new kjd     // Catch: java.lang.Exception -> L55
                r8.<init>(r3)     // Catch: java.lang.Exception -> L55
                if (r8 != r4) goto L3c
                goto L54
            L3c:
                vi5 r8 = (defpackage.vi5) r8     // Catch: java.lang.Exception -> L55
                pld r3 = defpackage.pld.this     // Catch: java.lang.Exception -> L55
                na0 r5 = new na0     // Catch: java.lang.Exception -> L55
                r6 = 17
                r5.<init>(r3, r6)     // Catch: java.lang.Exception -> L55
                r7.L$0 = r1     // Catch: java.lang.Exception -> L55
                r7.label = r2     // Catch: java.lang.Exception -> L55
                r0.getClass()     // Catch: java.lang.Exception -> L55
                java.lang.Object r7 = defpackage.xb1.g(r8, r5, r7)     // Catch: java.lang.Exception -> L55
                if (r7 != r4) goto L60
            L54:
                return r4
            L55:
                r7 = move-exception
                java.util.ArrayList r8 = defpackage.lz2.a
                java.lang.String r8 = "Exception in Job Seeker Pro Status Data handling"
                r0 = 0
                java.lang.String r1 = "SavedTabViewModel"
                defpackage.lz2.b(r1, r8, r0, r7)
            L60:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pld.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$loadData$3", f = "SavedTabViewModel.kt", l = {DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, 412}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        Object L$0;
        int label;

        public g(lu2<? super g> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pld.this.new g(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r8, r5, r7) == r4) goto L19;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L55
                goto L60
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r1
            L17:
                java.lang.Object r0 = r7.L$0
                pld r0 = (defpackage.pld) r0
                defpackage.r7d.b(r8)     // Catch: java.lang.Exception -> L55
                goto L3c
            L1f:
                defpackage.r7d.b(r8)
                pld r0 = defpackage.pld.this     // Catch: java.lang.Exception -> L55
                k36 r8 = r0.c0     // Catch: java.lang.Exception -> L55
                j6g r5 = defpackage.j6g.a     // Catch: java.lang.Exception -> L55
                r7.L$0 = r0     // Catch: java.lang.Exception -> L55
                r7.label = r3     // Catch: java.lang.Exception -> L55
                r8.getClass()     // Catch: java.lang.Exception -> L55
                l36 r3 = new l36     // Catch: java.lang.Exception -> L55
                r3.<init>(r8, r1)     // Catch: java.lang.Exception -> L55
                kjd r8 = new kjd     // Catch: java.lang.Exception -> L55
                r8.<init>(r3)     // Catch: java.lang.Exception -> L55
                if (r8 != r4) goto L3c
                goto L54
            L3c:
                vi5 r8 = (defpackage.vi5) r8     // Catch: java.lang.Exception -> L55
                pld r3 = defpackage.pld.this     // Catch: java.lang.Exception -> L55
                me r5 = new me     // Catch: java.lang.Exception -> L55
                r6 = 17
                r5.<init>(r3, r6)     // Catch: java.lang.Exception -> L55
                r7.L$0 = r1     // Catch: java.lang.Exception -> L55
                r7.label = r2     // Catch: java.lang.Exception -> L55
                r0.getClass()     // Catch: java.lang.Exception -> L55
                java.lang.Object r7 = defpackage.xb1.g(r8, r5, r7)     // Catch: java.lang.Exception -> L55
                if (r7 != r4) goto L60
            L54:
                return r4
            L55:
                r7 = move-exception
                java.util.ArrayList r8 = defpackage.lz2.a
                java.lang.String r8 = "Exception in Top Choice Budget Data handling"
                r0 = 0
                java.lang.String r1 = "SavedTabViewModel"
                defpackage.lz2.b(r1, r8, r0, r7)
            L60:
                j6g r7 = defpackage.j6g.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pld.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$logBrandedAdEvent$1", f = "SavedTabViewModel.kt", l = {537, 537}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ BrandedAdsDto $brandedAdsDto;
        final /* synthetic */ String $event;
        Object L$0;
        int label;
        final /* synthetic */ pld this$0;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$logBrandedAdEvent$1$1", f = "SavedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<hf3<j6g>, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(hf3<j6g> hf3Var, lu2<? super j6g> lu2Var) {
                return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BrandedAdsDto brandedAdsDto, String str, pld pldVar, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$brandedAdsDto = brandedAdsDto;
            this.$event = str;
            this.this$0 = pldVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new h(this.$brandedAdsDto, this.$event, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r7, r0, r6) == r4) goto L23;
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
                r1 = 1
                r2 = 0
                r3 = 2
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L25
                if (r0 == r1) goto L1d
                if (r0 != r3) goto L17
                java.lang.Object r0 = r6.L$0
                com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r0 = (com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams) r0
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L15
                goto L78
            L15:
                r7 = move-exception
                goto L60
            L17:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r2
            L1d:
                java.lang.Object r0 = r6.L$0
                com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r0 = (com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams) r0
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L15
                goto L4e
            L25:
                defpackage.r7d.b(r7)
                com.indeed.android.myjobs.data.model.dto.BrandedAdsDto r7 = r6.$brandedAdsDto     // Catch: java.lang.Exception -> L15
                java.lang.String r0 = r6.$event     // Catch: java.lang.Exception -> L15
                com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams r7 = defpackage.u63.p0(r7, r0)     // Catch: java.lang.Exception -> L15
                pld r0 = r6.this$0     // Catch: java.lang.Exception -> L15
                x29 r0 = r0.f0     // Catch: java.lang.Exception -> L15
                x29$a r5 = new x29$a     // Catch: java.lang.Exception -> L15
                r5.<init>(r7)     // Catch: java.lang.Exception -> L15
                r6.L$0 = r2     // Catch: java.lang.Exception -> L15
                r6.label = r1     // Catch: java.lang.Exception -> L15
                r0.getClass()     // Catch: java.lang.Exception -> L15
                y29 r7 = new y29     // Catch: java.lang.Exception -> L15
                r7.<init>(r0, r5, r2)     // Catch: java.lang.Exception -> L15
                kjd r0 = new kjd     // Catch: java.lang.Exception -> L15
                r0.<init>(r7)     // Catch: java.lang.Exception -> L15
                if (r0 != r4) goto L4d
                goto L5f
            L4d:
                r7 = r0
            L4e:
                vi5 r7 = (defpackage.vi5) r7     // Catch: java.lang.Exception -> L15
                pld$h$a r0 = new pld$h$a     // Catch: java.lang.Exception -> L15
                r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L15
                r6.L$0 = r2     // Catch: java.lang.Exception -> L15
                r6.label = r3     // Catch: java.lang.Exception -> L15
                java.lang.Object r6 = defpackage.wg2.q(r7, r0, r6)     // Catch: java.lang.Exception -> L15
                if (r6 != r4) goto L78
            L5f:
                return r4
            L60:
                java.util.ArrayList r0 = defpackage.lz2.a
                java.lang.String r6 = r6.$event
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Exception in logging branded ad event "
                r0.<init>(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r0 = 0
                java.lang.String r1 = "SavedTabViewModel"
                defpackage.lz2.b(r1, r6, r0, r7)
            L78:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pld.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$onTriggerEvent$1", f = "SavedTabViewModel.kt", l = {95, 95, 121, 120, 203, 203, 209, 209, 235}, m = "invokeSuspend")
    public static final class i extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ c $event;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ pld this$0;

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$onTriggerEvent$1$4", f = "SavedTabViewModel.kt", l = {182, 183}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ c $event;
            int label;
            final /* synthetic */ pld this$0;

            /* JADX INFO: renamed from: pld$i$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$onTriggerEvent$1$4$1", f = "SavedTabViewModel.kt", l = {}, m = "invokeSuspend")
            public static final class C0389a extends c1f implements Function2<hf3<wz5.a>, lu2<? super j6g>, Object> {
                final /* synthetic */ c $event;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0389a(c cVar, lu2<? super C0389a> lu2Var) {
                    super(2, lu2Var);
                    this.$event = cVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0389a c0389a = new C0389a(this.$event, lu2Var);
                    c0389a.L$0 = obj;
                    return c0389a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(hf3<wz5.a> hf3Var, lu2<? super j6g> lu2Var) {
                    return ((C0389a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    hf3 hf3Var = (hf3) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    if (hf3Var instanceof hf3.c) {
                        ArrayList arrayList = ((wz5.a) ((hf3.c) hf3Var).a).a;
                        if (!arrayList.isEmpty()) {
                            ((c.g) this.$event).c.invoke(z92.O0(arrayList));
                        }
                    } else if (!(hf3Var instanceof hf3.b)) {
                        if (!(hf3Var instanceof hf3.a)) {
                            l.g();
                            return null;
                        }
                        c.g gVar = (c.g) this.$event;
                        gVar.c.invoke(gVar.b);
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lu2 lu2Var, c cVar, pld pldVar) {
                super(2, lu2Var);
                this.this$0 = pldVar;
                this.$event = cVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(lu2Var, this.$event, this.this$0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
            
                if (defpackage.wg2.q((defpackage.vi5) r7, r0, r6) == r4) goto L15;
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
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r3) goto L17
                    if (r0 != r2) goto L11
                    defpackage.r7d.b(r7)
                    goto L55
                L11:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r6)
                    return r1
                L17:
                    defpackage.r7d.b(r7)
                    goto L43
                L1b:
                    defpackage.r7d.b(r7)
                    pld r7 = r6.this$0
                    wz5 r7 = r7.Y
                    wz5$b r0 = new wz5$b
                    pld$c r5 = r6.$event
                    pld$c$g r5 = (pld.c.g) r5
                    java.lang.String r5 = r5.a
                    java.util.List r5 = defpackage.u63.Z(r5)
                    r0.<init>(r5)
                    r6.label = r3
                    r7.getClass()
                    xz5 r3 = new xz5
                    r3.<init>(r7, r0, r1)
                    kjd r7 = new kjd
                    r7.<init>(r3)
                    if (r7 != r4) goto L43
                    goto L54
                L43:
                    vi5 r7 = (defpackage.vi5) r7
                    pld$i$a$a r0 = new pld$i$a$a
                    pld$c r3 = r6.$event
                    r0.<init>(r3, r1)
                    r6.label = r2
                    java.lang.Object r6 = defpackage.wg2.q(r7, r0, r6)
                    if (r6 != r4) goto L55
                L54:
                    return r4
                L55:
                    j6g r6 = defpackage.j6g.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: pld.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$onTriggerEvent$1$5", f = "SavedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((b) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.SavedTabViewModel$onTriggerEvent$1$6", f = "SavedTabViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                return ((c) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(lu2 lu2Var, c cVar, pld pldVar) {
            super(2, lu2Var);
            this.$event = cVar;
            this.this$0 = pldVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new i(lu2Var, this.$event, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((i) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r0, r3, r56) != r10) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x015a, code lost:
        
            if (defpackage.xb1.g((defpackage.vi5) r0, r6, r56) != r10) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x02b5, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r0, r1, r56) != r10) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x02f7, code lost:
        
            if (defpackage.wg2.q((defpackage.vi5) r0, r1, r56) != r10) goto L121;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r57) {
            /*
                Method dump skipped, instruction units count: 1332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pld.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public pld(okd okdVar, sx3 sx3Var, dfg dfgVar, x46 x46Var, wz5 wz5Var, g26 g26Var, q66 q66Var, bkd bkdVar, s0a s0aVar, k36 k36Var, e16 e16Var, a06 a06Var, x29 x29Var, c39 c39Var) {
        this.f = okdVar;
        this.V = sx3Var;
        this.W = dfgVar;
        this.X = x46Var;
        this.Y = wz5Var;
        this.Z = g26Var;
        this.a0 = bkdVar;
        this.b0 = s0aVar;
        this.c0 = k36Var;
        this.d0 = e16Var;
        this.e0 = a06Var;
        this.f0 = x29Var;
        this.g0 = c39Var;
        old.a(i(), null, null, false, 0, null, null, true, null, false, null, false, null, null, false, false, 0, 262015);
        u63.Y(ee3.p(this), null, null, new a(null), 3);
        nde ndeVarD = wg2.d(0, 0, null, 7);
        this.k0 = ndeVarD;
        this.l0 = wg2.i(ndeVarD);
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new old(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(int r31, int r32, defpackage.pu2 r33) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.l(int, int, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r2 == r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(int r22, defpackage.pu2 r23) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.m(int, pu2):java.lang.Object");
    }

    public final void n() {
        if (i6a.k()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.h0;
            if (j < 2000) {
                ArrayList arrayList = lz2.a;
                Log.d("SavedTabViewModel", u40.c(j, "Skip branded ad fetch, min interval not reached (elapsed: ", " ms)"), null);
            } else {
                this.h0 = jCurrentTimeMillis;
                u63.Y(ee3.p(this), null, null, new d(null), 3);
            }
        }
    }

    public final void o(boolean z) {
        boolean z2 = this.i0;
        this.i0 = true;
        this.j0 = -1;
        u63.Y(ee3.p(this), null, null, new e(z, null), 3);
        ra8 ra8Var = i6a.a;
        if (((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_top_choice_features").a >= 1) {
            u63.Y(ee3.p(this), null, null, new f(null), 3);
            u63.Y(ee3.p(this), null, null, new g(null), 3);
        }
        if (z && z2) {
            this.g0.b("Saved", ee3.p(this));
        }
    }

    public final void p(BrandedAdsDto brandedAdsDto, String str) {
        brandedAdsDto.getClass();
        u63.Y(ee3.p(this), null, null, new h(brandedAdsDto, str, this, null), 3);
    }

    public final void q(c cVar) {
        cVar.getClass();
        u63.Y(ee3.p(this), null, null, new i(null, cVar, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:21:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.tld
            if (r0 == 0) goto L13
            r0 = r7
            tld r0 = (defpackage.tld) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            tld r0 = new tld
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r1 = r0.I$1
            int r3 = r0.I$0
            defpackage.r7d.b(r7)
            goto L54
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L30:
            defpackage.r7d.b(r7)
            r7 = 0
            r1 = 100
            r3 = r7
        L37:
            xo6 r7 = r6.i()
            old r7 = (defpackage.old) r7
            boolean r7 = r7.g
            if (r7 == 0) goto L56
            if (r3 >= r1) goto L56
            r0.I$0 = r3
            r0.I$1 = r1
            r0.label = r2
            r4 = 100
            java.lang.Object r7 = defpackage.ls3.b(r4, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L54
            return r4
        L54:
            int r3 = r3 + r2
            goto L37
        L56:
            xo6 r6 = r6.i()
            old r6 = (defpackage.old) r6
            boolean r6 = r6.g
            r6 = r6 ^ r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.r(pu2):java.lang.Object");
    }

    public static abstract class c implements uo6 {

        public static final class b extends c {
        }

        /* JADX INFO: renamed from: pld$c$c, reason: collision with other inner class name */
        public static final class C0388c extends c {
        }

        public static final class d extends c {
            public final s9 a;

            public d(s9 s9Var) {
                this.a = s9Var;
            }
        }

        public static final class e extends c {
            public final boolean a;

            public e(boolean z) {
                this.a = z;
            }
        }

        public static final class f extends c {
            public final String a;

            public f(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class g extends c {
            public final String a;
            public final String b;
            public final vi1 c;

            public g(String str, String str2, vi1 vi1Var) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
                this.c = vi1Var;
            }
        }

        public static final class h extends c {
            public static final h a = new h();
        }

        public static final class i extends c {
            public static final i a = new i();
        }

        public static final class j extends c {
            public final String a;

            public j(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class k extends c {
            public final String a;

            public k(String str) {
                str.getClass();
                this.a = str;
            }
        }

        public static final class l extends c {
            public final SavedJobsDto a;

            public l(SavedJobsDto savedJobsDto) {
                this.a = savedJobsDto;
            }
        }

        public static final class m extends c {
            public static final m a = new m();
        }

        public static final class n extends c {
            public final String a;
            public final String b;
            public final String c;

            public n(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
                this.c = str3;
            }
        }

        public static final class a extends c {
            public final String a;

            public a(int i) {
                this.a = "myjobs-saved-tab";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return l5.m("AdCardClick(source=", this.a, ")");
            }

            public a() {
                this(0);
            }
        }
    }
}
