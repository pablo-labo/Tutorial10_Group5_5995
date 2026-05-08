package defpackage;

import androidx.compose.runtime.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.an;
import defpackage.cv8;
import defpackage.gbf;
import defpackage.hva;
import defpackage.ig3;
import defpackage.nfg;
import defpackage.ocg;
import defpackage.w8d;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yvb extends brg implements xh8 {
    public final rqc V;
    public final zcd b;
    public final c0g c;
    public final g4a d;
    public final g4a e;
    public final gse f;

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$addNewLanguageSkill$1$1", f = "ProfileSectionsViewModel.kt", l = {2116}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ wj8 $languageSkill;
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, wj8 wj8Var, gu5<j6g> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$resumeId = str;
            this.$languageSkill = wj8Var;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = yvb.this.new a(this.$resumeId, this.$languageSkill, this.$onComplete, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objF;
            gbf.a aVar;
            gbf.a aVar2;
            e13 e13Var = (e13) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zcd zcdVar = yvb.this.b;
                String str = this.$resumeId;
                wj8 wj8Var = this.$languageSkill;
                wj8Var.getClass();
                String str2 = wj8Var.d;
                String str3 = wj8Var.b;
                String str4 = wj8Var.c;
                iq iqVar = str4 != null ? new iq(str3 == null ? "" : str3, str4) : null;
                if (str3 == null) {
                    str3 = "";
                }
                kq kqVar = new kq(str3, iqVar == null ? hva.a.a : new hva.c(iqVar));
                String str5 = wj8Var.e;
                iq iqVar2 = str5 != null ? new iq(str2 != null ? str2 : "", str5) : null;
                kq kqVar2 = str2 != null ? new kq(str2, iqVar2 == null ? hva.a.a : new hva.c(iqVar2)) : null;
                List listZ = u63.Z(new sk(new hva.c(kqVar), kqVar2 == null ? hva.a.a : new hva.c(kqVar2)));
                this.L$0 = e13Var;
                this.label = 1;
                objF = zcdVar.f(str, listZ, this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objF = obj;
            }
            List list = (List) objF;
            yvb yvbVar = yvb.this;
            if (list != null) {
                gu5<j6g> gu5Var = this.$onComplete;
                List list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    w8d w8dVar = ((an.c) it.next()).b;
                    String str6 = w8dVar.a;
                    w8d.a aVar3 = w8dVar.b;
                    String str7 = aVar3 != null ? aVar3.b.a : null;
                    String str8 = (aVar3 == null || (aVar2 = aVar3.b.b) == null) ? null : aVar2.b.d;
                    w8d.b bVar = w8dVar.c;
                    arrayList.add(new wj8(32, str6, str7, str8, bVar != null ? bVar.b.a : null, (bVar == null || (aVar = bVar.b.b) == null) ? null : aVar.b.d));
                }
                List<wj8> list3 = yvbVar.v().N;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    String str9 = ((wj8) obj2).b;
                    wj8 wj8Var2 = (wj8) z92.Q0(arrayList);
                    if (!wl7.b(str9, wj8Var2 != null ? wj8Var2.b : null)) {
                        arrayList2.add(obj2);
                    }
                }
                ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, z92.h1(new ArrayList(arrayList2), arrayList), null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388479));
                ((gme) yvbVar.e).setValue(b5g.a);
                gu5Var.invoke();
            } else {
                ((gme) yvbVar.e).setValue(b5g.c);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$addNewLicense$1$1", f = "ProfileSectionsViewModel.kt", l = {1886, 1903}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ a18 $inputDateRange;
        final /* synthetic */ av8 $license;
        final /* synthetic */ p38 $location;
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        final /* synthetic */ iq $taxonomyConceptTitleItem;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, av8 av8Var, a18 a18Var, p38 p38Var, iq iqVar, gu5<j6g> gu5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$resumeId = str;
            this.$license = av8Var;
            this.$inputDateRange = a18Var;
            this.$location = p38Var;
            this.$taxonomyConceptTitleItem = iqVar;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = yvb.this.new b(this.$resumeId, this.$license, this.$inputDateRange, this.$location, this.$taxonomyConceptTitleItem, this.$onComplete, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r67) {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yvb.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$addNewSkill$1$1", f = "ProfileSectionsViewModel.kt", l = {2341, 2345}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        final /* synthetic */ zie $skillItem;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ yvb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zie zieVar, yvb yvbVar, String str, gu5<j6g> gu5Var, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$skillItem = zieVar;
            this.this$0 = yvbVar;
            this.$resumeId = str;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(this.$skillItem, this.this$0, this.$resumeId, this.$onComplete, lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
        
            if (r1 == r6) goto L42;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r65) {
            /*
                Method dump skipped, instruction units count: 540
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yvb.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$deleteLanguageSkills$1", f = "ProfileSectionsViewModel.kt", l = {2235}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<String> $languageIdsToDelete;
        final /* synthetic */ String $resumeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List<String> list, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$resumeId = str;
            this.$languageIdsToDelete = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            d dVar = yvb.this.new d(this.$resumeId, this.$languageIdsToDelete, lu2Var);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objS;
            e13 e13Var = (e13) this.L$0;
            int i = this.label;
            b5g b5gVar = b5g.c;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    zcd zcdVar = yvb.this.b;
                    String str = this.$resumeId;
                    List<String> list = this.$languageIdsToDelete;
                    this.L$0 = e13Var;
                    this.label = 1;
                    objS = zcdVar.s(str, list, this);
                    g13 g13Var = g13.a;
                    if (objS == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    objS = obj;
                }
                List list2 = (List) objS;
                yvb yvbVar = yvb.this;
                if (list2 != null) {
                    List<wj8> list3 = yvbVar.v().N;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        if (!z92.I0(list2, ((wj8) obj2).a)) {
                            arrayList.add(obj2);
                        }
                    }
                    ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388479));
                    ((gme) yvbVar.e).setValue(b5g.a);
                } else {
                    ((gme) yvbVar.e).setValue(b5gVar);
                }
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.b("ProfileSectionsViewModel", "Error deleting language skills: " + e.getMessage(), false, e);
                ((gme) yvb.this.e).setValue(b5gVar);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$deleteLicense$1$1$1", f = "ProfileSectionsViewModel.kt", l = {2016}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $deleteItemId;
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, gu5<j6g> gu5Var, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$resumeId = str;
            this.$deleteItemId = str2;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            e eVar = yvb.this.new e(this.$resumeId, this.$deleteItemId, this.$onComplete, lu2Var);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r66) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yvb.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editLanguageSkill$1$1", f = "ProfileSectionsViewModel.kt", l = {2165}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fag $languageSkill;
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, fag fagVar, gu5<j6g> gu5Var, lu2<? super f> lu2Var) {
            super(2, lu2Var);
            this.$resumeId = str;
            this.$languageSkill = fagVar;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            f fVar = yvb.this.new f(this.$resumeId, this.$languageSkill, this.$onComplete, lu2Var);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objP;
            boolean z;
            gbf.a aVar;
            gbf.a aVar2;
            e13 e13Var = (e13) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zcd zcdVar = yvb.this.b;
                String str = this.$resumeId;
                List listZ = u63.Z(this.$languageSkill);
                this.L$0 = e13Var;
                this.label = 1;
                objP = zcdVar.P(str, listZ, this);
                g13 g13Var = g13.a;
                if (objP == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objP = obj;
            }
            List list = (List) objP;
            List<wj8> list2 = yvb.this.v().N;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((wj8) obj2).f) {
                    arrayList.add(obj2);
                }
            }
            yvb yvbVar = yvb.this;
            if (list != null) {
                gu5<j6g> gu5Var = this.$onComplete;
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(t92.r0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    w8d w8dVar = ((nfg.b) it.next()).b;
                    w8d.a aVar3 = w8dVar.b;
                    if (arrayList.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (wl7.b(((wj8) it2.next()).b, aVar3 != null ? aVar3.b.a : null)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                    }
                    String str2 = w8dVar.a;
                    String str3 = aVar3 != null ? aVar3.b.a : null;
                    String str4 = (aVar3 == null || (aVar2 = aVar3.b.b) == null) ? null : aVar2.b.d;
                    w8d.b bVar = w8dVar.c;
                    arrayList2.add(new wj8(str2, str3, z, str4, bVar != null ? bVar.b.a : null, (bVar == null || (aVar = bVar.b.b) == null) ? null : aVar.b.d));
                }
                ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388479));
                ((gme) yvbVar.e).setValue(b5g.a);
                gu5Var.invoke();
            } else {
                ((gme) yvbVar.e).setValue(b5g.c);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editLicense$1$1", f = "ProfileSectionsViewModel.kt", l = {1963}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ a18 $inputDateRange;
        final /* synthetic */ av8 $license;
        final /* synthetic */ p38 $location;
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        final /* synthetic */ xeg $taxonomyConceptTitleItem;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, av8 av8Var, a18 a18Var, p38 p38Var, xeg xegVar, gu5<j6g> gu5Var, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$resumeId = str;
            this.$license = av8Var;
            this.$inputDateRange = a18Var;
            this.$location = p38Var;
            this.$taxonomyConceptTitleItem = xegVar;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            g gVar = yvb.this.new g(this.$resumeId, this.$license, this.$inputDateRange, this.$location, this.$taxonomyConceptTitleItem, this.$onComplete, lu2Var);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objQ;
            e13 e13Var = (e13) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zcd zcdVar = yvb.this.b;
                String str = this.$resumeId;
                av8 av8Var = this.$license;
                String str2 = av8Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                String str4 = av8Var.b;
                hva cVar = str4 == null ? hva.a.a : new hva.c(str4);
                a18 a18Var = this.$inputDateRange;
                hva cVar2 = a18Var == null ? hva.a.a : new hva.c(a18Var);
                p38 p38Var = this.$location;
                hva cVar3 = p38Var == null ? hva.a.a : new hva.c(p38Var);
                k38 k38Var = this.$license.f;
                hva cVar4 = k38Var == null ? hva.a.a : new hva.c(k38Var);
                List<String> list = this.$license.c;
                hva cVar5 = list == null ? hva.a.a : new hva.c(list);
                xeg xegVar = this.$taxonomyConceptTitleItem;
                List listZ = u63.Z(new hag(str3, cVar2, cVar5, cVar3, xegVar == null ? hva.a.a : new hva.c(xegVar), cVar4, cVar));
                this.L$0 = e13Var;
                this.label = 1;
                objQ = zcdVar.Q(str, listZ, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objQ = obj;
            }
            List list2 = (List) objQ;
            yvb yvbVar = yvb.this;
            if (list2 != null) {
                gu5<j6g> gu5Var = this.$onComplete;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    cv8 cv8Var = ((ocg.b) it.next()).b;
                    String str5 = cv8Var.h;
                    String str6 = cv8Var.a;
                    cv8.a aVar = cv8Var.g;
                    arrayList.add(new av8(str5, str6, cv8Var.b, cv8Var.e, cv8Var.d, cv8Var.f, aVar != null ? aVar.b : null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                }
                List<av8> list4 = yvbVar.v().L;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list4) {
                    String str7 = ((av8) obj2).a;
                    av8 av8Var2 = (av8) z92.Q0(arrayList);
                    if (!wl7.b(str7, av8Var2 != null ? av8Var2.a : null)) {
                        arrayList2.add(obj2);
                    }
                }
                ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, z92.h1(new ArrayList(arrayList2), arrayList), null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388575));
                ((gme) yvbVar.e).setValue(b5g.a);
                gu5Var.invoke();
            } else {
                ((gme) yvbVar.e).setValue(b5g.c);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$editSkill$1$1", f = "ProfileSectionsViewModel.kt", l = {2447, 2454, 2472}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ zie $childSkillItemToAdd;
        final /* synthetic */ gu5<j6g> $onComplete;
        final /* synthetic */ String $resumeId;
        final /* synthetic */ String $skillId;
        final /* synthetic */ zie $updatedSkillItem;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ yvb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(zie zieVar, yvb yvbVar, String str, zie zieVar2, String str2, gu5<j6g> gu5Var, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$childSkillItemToAdd = zieVar;
            this.this$0 = yvbVar;
            this.$resumeId = str;
            this.$updatedSkillItem = zieVar2;
            this.$skillId = str2;
            this.$onComplete = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            h hVar = new h(this.$childSkillItemToAdd, this.this$0, this.$resumeId, this.$updatedSkillItem, this.$skillId, this.$onComplete, lu2Var);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (r2 == r8) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
        
            if (r1 != r8) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0124 A[PHI: r2 r4
  0x0124: PHI (r2v13 java.util.List) = (r2v10 java.util.List), (r2v28 java.util.List) binds: [B:61:0x0121, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0124: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v6 java.lang.Object) binds: [B:61:0x0121, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r67) {
            /*
                Method dump skipped, instruction units count: 685
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yvb.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$getCrowTaxoSkillModel$1", f = "ProfileSectionsViewModel.kt", l = {2694}, m = "invokeSuspend")
    public static final class i extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $crowTaxoSkillSuid;
        int label;
        final /* synthetic */ yvb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(lu2 lu2Var, yvb yvbVar, String str) {
            super(2, lu2Var);
            this.this$0 = yvbVar;
            this.$crowTaxoSkillSuid = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new i(lu2Var, this.this$0, this.$crowTaxoSkillSuid);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((i) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objE;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zcd zcdVar = this.this$0.b;
                String str = this.$crowTaxoSkillSuid;
                this.label = 1;
                objE = zcdVar.E(str, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objE = obj;
            }
            yvb yvbVar = this.this$0;
            ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, (x73) objE, null, null, false, null, false, null, false, null, null, null, -1, 8384511));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$getCrowTaxoSkillOQVTBySkillId$2", f = "ProfileSectionsViewModel.kt", l = {2670}, m = "invokeSuspend")
    public static final class j extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $crowTaxoSkillSuid;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ yvb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(lu2 lu2Var, yvb yvbVar, String str) {
            super(2, lu2Var);
            this.this$0 = yvbVar;
            this.$crowTaxoSkillSuid = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            j jVar = new j(lu2Var, this.this$0, this.$crowTaxoSkillSuid);
            jVar.L$0 = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((j) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            e13 e13Var = (e13) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zcd zcdVar = this.this$0.b;
                String str = this.$crowTaxoSkillSuid;
                this.L$0 = e13Var;
                this.label = 1;
                obj = zcdVar.E(str, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            x73 x73Var = (x73) obj;
            yvb yvbVar = this.this$0;
            if (x73Var != null) {
                gse gseVar = yvbVar.f;
                do {
                    value2 = gseVar.getValue();
                } while (!gseVar.h(value2, dqb.a((dqb) value2, x73Var, false, false, null, null, true, 24)));
            } else {
                gse gseVar2 = yvbVar.f;
                do {
                    value = gseVar2.getValue();
                } while (!gseVar2.h(value, dqb.a((dqb) value, null, false, true, null, null, false, 25)));
            }
            return j6g.a;
        }
    }

    public yvb(zcd zcdVar) {
        int i2 = 0;
        svb svbVar = new svb(i2);
        c0g c0gVar = new c0g();
        zcdVar.getClass();
        this.b = zcdVar;
        this.c = c0gVar;
        this.d = r.f(svbVar);
        this.e = r.f(b5g.a);
        gse gseVarE = hh2.e(new dqb(i2));
        this.f = gseVarE;
        this.V = wg2.Z(gseVarE, ee3.p(this), new xre(5000L, Long.MAX_VALUE), gseVarE.getValue());
    }

    public static d18 A(tg3 tg3Var) {
        if (tg3Var == null) {
            return null;
        }
        s38 s38Var = tg3Var.b;
        hva cVar = s38Var == null ? hva.a.a : new hva.c(s38Var);
        Integer num = tg3Var.c;
        return new d18(cVar, num == null ? hva.a.a : new hva.c(num));
    }

    public static Pair B(go4 go4Var) {
        p38 p38Var;
        go4Var.getClass();
        String str = go4Var.h;
        a18 a18VarZ = z(go4Var.j);
        String str2 = go4Var.i;
        if (str2 == null && str == null) {
            p38Var = null;
        } else {
            p38Var = new p38(null, str == null ? hva.a.a : new hva.c(str), null, null, str2 == null ? hva.a.a : new hva.c(str2), 16255);
        }
        return new Pair(a18VarZ, p38Var);
    }

    public static Integer j(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof String) {
            return Integer.valueOf(Integer.parseInt((String) obj));
        }
        return null;
    }

    public static void n(yvb yvbVar, boolean z, String str, ArrayList arrayList, gu5 gu5Var, int i2) {
        List listZ;
        String str2 = (i2 & 2) != 0 ? null : str;
        ArrayList arrayList2 = (i2 & 4) != 0 ? null : arrayList;
        gu5 gu5Var2 = (i2 & 8) != 0 ? null : gu5Var;
        yvbVar.getClass();
        if (z) {
            svb svbVarV = yvbVar.v();
            List<zie> list = yvbVar.v().R;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (!((zie) obj).e) {
                    arrayList3.add(obj);
                }
            }
            ((gme) yvbVar.d).setValue(svb.a(svbVarV, null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayList3, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
            if (gu5Var2 != null) {
                gu5Var2.invoke();
                j6g j6gVar = j6g.a;
                return;
            }
            return;
        }
        if (str2 != null) {
            listZ = u63.Z(str2);
        } else if (arrayList2 != null) {
            ArrayList arrayList4 = new ArrayList(t92.r0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str3 = ((zie) it.next()).a;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList4.add(str3);
            }
            listZ = arrayList4;
        } else {
            List<zie> list2 = yvbVar.v().Q;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : list2) {
                if (((zie) obj2).e) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(t92.r0(arrayList5, 10));
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                String str4 = ((zie) it2.next()).a;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList6.add(str4);
            }
            listZ = arrayList6;
        }
        String str5 = yvbVar.v().a;
        if (str5 != null) {
            ((gme) yvbVar.e).setValue(b5g.b);
            u63.Y(ee3.p(yvbVar), null, null, new kwb(yvbVar, str5, listZ, gu5Var2, null), 3);
        } else if (gu5Var2 != null) {
            gu5Var2.invoke();
            j6g j6gVar2 = j6g.a;
        }
    }

    public static a18 z(ig3 ig3Var) {
        if (ig3Var == null) {
            return null;
        }
        ig3.b bVar = ig3Var.c;
        ig3.a aVar = ig3Var.a;
        s38 s38Var = aVar != null ? aVar.b : null;
        hva cVar = s38Var == null ? hva.a.a : new hva.c(s38Var);
        Integer num = aVar != null ? aVar.c : null;
        hva.c cVar2 = new hva.c(new d18(cVar, num == null ? hva.a.a : new hva.c(num)));
        s38 s38Var2 = bVar != null ? bVar.b : null;
        hva cVar3 = s38Var2 == null ? hva.a.a : new hva.c(s38Var2);
        Integer num2 = bVar != null ? bVar.c : null;
        hva.c cVar4 = new hva.c(new d18(cVar3, num2 == null ? hva.a.a : new hva.c(num2)));
        Boolean bool = ig3Var.b;
        return new a18(cVar2, cVar4, bool == null ? hva.a.a : new hva.c(bool));
    }

    public final void C() {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, new ux8("", ""), null, null, -1, 7340031));
    }

    public final void D(hz1 hz1Var) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, hz1Var, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388599));
    }

    public final void E(jo4 jo4Var) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, jo4Var, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -16777217, 8388607));
    }

    public final void F(j2h j2hVar) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, j2hVar, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33, 8388607));
    }

    public final void G(boolean z) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, z, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388605));
    }

    public final void H(hz1 hz1Var) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, hz1Var, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388603));
    }

    public final void I(String str, String str2) {
        str.getClass();
        str2.getClass();
        while (true) {
            gse gseVar = this.f;
            Object value = gseVar.getValue();
            String str3 = str;
            String str4 = str2;
            if (gseVar.h(value, dqb.a((dqb) value, null, false, false, str3, str4, false, 39))) {
                return;
            }
            str = str3;
            str2 = str4;
        }
    }

    public final void J(mu0 mu0Var) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, mu0Var, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1073741825, 8388607));
    }

    public final void K(String str) {
        str.getClass();
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, str, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388591));
    }

    public final void L() {
        Object next;
        Map mapA0 = lc9.a0(new Pair(k38.e, u63.a0(bv8.NURSE, bv8.NURSERY, bv8.NURSING, bv8.CNA, bv8.RN, bv8.LPN)), new Pair(k38.c, u63.a0(bv8.ACCOUNTANT, bv8.ACCOUNTING, bv8.ACCOUNTS_PAYABLE, bv8.ACCOUNTS_RECEIVABLE, bv8.CPA)), new Pair(k38.d, u63.a0(bv8.DRIVER, bv8.BUS_OPERATOR, bv8.FORK_LIFT_OPERATOR)));
        j2h j2hVar = (j2h) z92.Q0(v().g);
        g4a g4aVar = this.d;
        if (j2hVar == null) {
            ((gme) g4aVar).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388543));
            return;
        }
        String str = j2hVar.b;
        Iterator it = mapA0.keySet().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = (List) mapA0.get((k38) next);
            if (list != null) {
                List<bv8> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (bv8 bv8Var : list2) {
                        if (str != null) {
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (zve.L(lowerCase, bv8Var.a(), false)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        gme gmeVar = (gme) g4aVar;
        gmeVar.setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, (k38) next, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388543));
    }

    public final void M(q5b q5bVar) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, q5bVar, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -524289, 8388607));
    }

    public final void N(r6c r6cVar) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, r6cVar, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -32769, 8388607));
    }

    public final void O(j2h j2hVar) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, j2hVar, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -17, 8388607));
    }

    public final void P(boolean z) {
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, z, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -257, 8388607));
    }

    public final void Q(boolean z, zie zieVar) {
        ArrayList arrayList;
        zieVar.getClass();
        String str = zieVar.a;
        g4a g4aVar = this.d;
        if (!z) {
            List<zie> list = v().Q;
            ArrayList arrayList2 = new ArrayList(t92.r0(list, 10));
            for (zie zieVarA : list) {
                if (wl7.b(zieVarA.a, str)) {
                    zieVarA = zie.a(zieVarA, null, null, null, false, null, null, 1007);
                }
                arrayList2.add(zieVarA);
            }
            ((gme) g4aVar).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, arrayList2, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8387583));
            return;
        }
        if (str != null) {
            List<zie> list2 = v().R;
            arrayList = new ArrayList(t92.r0(list2, 10));
            for (zie zieVarA2 : list2) {
                if (wl7.b(zieVarA2.a, str)) {
                    zieVarA2 = zie.a(zieVarA2, null, null, null, false, null, null, 1007);
                }
                arrayList.add(zieVarA2);
            }
        } else {
            List<zie> list3 = v().R;
            arrayList = new ArrayList(t92.r0(list3, 10));
            for (zie zieVarA3 : list3) {
                if (wl7.b(zieVarA3.b, zieVar.b)) {
                    zieVarA3 = zie.a(zieVarA3, null, null, null, false, null, null, 1007);
                }
                arrayList.add(zieVarA3);
            }
        }
        ((gme) g4aVar).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
    }

    public final void R(String str, String str2) {
        str.getClass();
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, new ux8(str2, str), null, null, -1, 7340031));
    }

    public final void g(wj8 wj8Var, gu5<j6g> gu5Var) {
        wj8Var.getClass();
        String str = v().a;
        if (str != null) {
            ((gme) this.e).setValue(b5g.b);
            u63.Y(ee3.p(this), null, null, new a(str, wj8Var, gu5Var, null), 3);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h(av8 av8Var, gu5<j6g> gu5Var) {
        String str;
        String str2;
        av8Var.getClass();
        String str3 = v().a;
        if (str3 != null) {
            a18 a18VarZ = z(av8Var.g);
            cv8.b bVar = av8Var.e;
            String str4 = bVar != null ? bVar.i : null;
            p38 p38Var = new p38(null, null, null, str4 == null ? hva.a.a : new hva.c(str4), null, 24575);
            cv8.d dVar = av8Var.d;
            iq iqVar = (dVar == null || (str = dVar.a) == null || (str2 = dVar.b) == null) ? null : new iq(str, str2);
            ((gme) this.e).setValue(b5g.b);
            u63.Y(ee3.p(this), null, null, new b(str3, av8Var, a18VarZ, p38Var, iqVar, gu5Var, null), 3);
        }
    }

    public final void i(zie zieVar, gu5<j6g> gu5Var) {
        zieVar.getClass();
        String str = v().a;
        if (str != null) {
            ((gme) this.e).setValue(b5g.b);
            u63.Y(ee3.p(this), null, null, new c(zieVar, this, str, gu5Var, null), 3);
        }
    }

    public final void k() {
        String str = v().a;
        if (str == null) {
            return;
        }
        List<wj8> list = v().N;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wj8) obj).f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || v().a == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((wj8) obj2).a == null) {
                arrayList2.add(obj2);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        g4a g4aVar = this.e;
        if (zIsEmpty) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = ((wj8) it.next()).a;
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            ((gme) g4aVar).setValue(b5g.b);
            if (arrayList3.isEmpty()) {
                return;
            }
            u63.Y(ee3.p(this), null, null, new d(str, arrayList3, null), 3);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str3 = ((wj8) it2.next()).b;
            if (str3 != null) {
                arrayList4.add(str3);
            }
        }
        String strW0 = z92.W0(arrayList4, ", ", null, null, null, 62);
        ArrayList arrayList5 = lz2.a;
        lz2.b("ProfileSectionsViewModel", l5.m("Cannot delete language skills without IDs: ", strW0, ". This indicates a data consistency issue."), false, new IllegalStateException("Language skills marked for deletion are missing required IDs"));
        ((gme) g4aVar).setValue(b5g.c);
    }

    public final void l(String str, gu5<j6g> gu5Var) {
        String str2;
        if (str == null || (str2 = v().a) == null) {
            return;
        }
        u63.Y(ee3.p(this), null, null, new e(str2, str, gu5Var, null), 3);
    }

    public final void m(List list, boolean z) {
        list.getClass();
        List<zie> list2 = v().Q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            zie zieVar = (zie) obj;
            List list3 = list;
            yie yieVar = zieVar.j;
            if (!z92.I0(list3, yieVar != null ? yieVar.a : null)) {
                yie yieVar2 = zieVar.j;
                String str = yieVar2 != null ? yieVar2.a : null;
                if (str == null || str.length() == 0) {
                    if (list.contains("__NULL_GROUP__")) {
                    }
                }
            }
            arrayList.add(obj);
        }
        n(this, z, null, arrayList, null, 10);
    }

    public final void o(String str) {
        str.getClass();
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, bbe.p(v().c0, str), -1, 4194303));
    }

    public final void p(wj8 wj8Var, gu5<j6g> gu5Var) {
        wj8Var.getClass();
        String str = v().a;
        if (str != null) {
            b5g b5gVar = b5g.b;
            g4a g4aVar = this.e;
            ((gme) g4aVar).setValue(b5gVar);
            try {
                u63.Y(ee3.p(this), null, null, new f(str, vaf.b(wj8Var), gu5Var, null), 3);
            } catch (Exception unused) {
                ((gme) g4aVar).setValue(b5g.c);
                j6g j6gVar = j6g.a;
            }
        }
    }

    public final void q(av8 av8Var, gu5<j6g> gu5Var) {
        xeg xegVar;
        String str;
        av8Var.getClass();
        String str2 = v().a;
        if (str2 != null) {
            a18 a18VarZ = z(av8Var.g);
            ((gme) this.e).setValue(b5g.b);
            cv8.b bVar = av8Var.e;
            String str3 = bVar != null ? bVar.i : null;
            p38 p38Var = new p38(null, null, null, str3 == null ? hva.a.a : new hva.c(str3), null, 24575);
            cv8.d dVar = av8Var.d;
            if (dVar != null) {
                String str4 = dVar.a;
                xegVar = (str4 == null || (str = dVar.b) == null) ? null : new xeg(new hva.c(str4), new hva.c(str), 28);
            } else {
                xegVar = null;
            }
            u63.Y(ee3.p(this), null, null, new g(str2, av8Var, a18VarZ, p38Var, xegVar, gu5Var, null), 3);
        }
    }

    public final void r(boolean z, String str, zie zieVar, zie zieVar2, gu5<j6g> gu5Var) {
        str.getClass();
        zieVar.getClass();
        if (z) {
            gu5Var.invoke();
            return;
        }
        String str2 = v().a;
        if (str2 != null) {
            ((gme) this.e).setValue(b5g.b);
            u63.Y(ee3.p(this), null, null, new h(zieVar2, this, str2, zieVar, str, gu5Var, null), 3);
        }
    }

    public final void s(String str) {
        u63.Y(ee3.p(this), null, null, new i(null, this, str), 3);
    }

    public final void t(String str) {
        gse gseVar;
        Object value;
        do {
            gseVar = this.f;
            value = gseVar.getValue();
        } while (!gseVar.h(value, dqb.a((dqb) value, null, true, false, null, null, false, 25)));
        u63.Y(ee3.p(this), null, null, new j(null, this, str), 3);
    }

    public final ArrayList u(String str, boolean z) {
        List<zie> list = z ? v().R : v().Q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            zie zieVar = (zie) obj;
            if (str == null || !wl7.b(zieVar.a, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((zie) it.next()).b;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!zve.U((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public final svb v() {
        return (svb) ((gme) this.d).getValue();
    }

    public final b5g w() {
        return (b5g) ((gme) this.e).getValue();
    }

    public final void x(String str) {
        str.getClass();
        List<wj8> list = v().N;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        for (wj8 wj8VarA : list) {
            if (wl7.b(wj8VarA.b, str)) {
                wj8VarA = wj8.a(wj8VarA, true);
            }
            arrayList.add(wj8VarA);
        }
        ((gme) this.d).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388479));
    }

    public final void y(boolean z, zie zieVar, boolean z2) {
        ArrayList arrayList;
        zieVar.getClass();
        if (z2) {
            n(this, z, zieVar.a, null, null, 12);
            return;
        }
        List<zie> list = z ? v().R : v().Q;
        String str = zieVar.a;
        if (str != null) {
            List<zie> list2 = list;
            ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
            for (zie zieVarA : list2) {
                if (wl7.b(zieVarA.a, str)) {
                    zieVarA = zie.a(zieVarA, null, null, null, true, null, null, 1007);
                }
                arrayList2.add(zieVarA);
            }
            arrayList = arrayList2;
        } else {
            List<zie> list3 = list;
            ArrayList arrayList3 = new ArrayList(t92.r0(list3, 10));
            for (zie zieVarA2 : list3) {
                if (wl7.b(zieVarA2.b, zieVar.b)) {
                    zieVarA2 = zie.a(zieVarA2, null, null, null, true, null, null, 1007);
                }
                arrayList3.add(zieVarA2);
            }
            arrayList = arrayList3;
        }
        g4a g4aVar = this.d;
        if (z) {
            ((gme) g4aVar).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
        } else {
            ((gme) g4aVar).setValue(svb.a(v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8387583));
        }
    }
}
