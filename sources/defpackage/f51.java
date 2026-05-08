package defpackage;

import android.util.Log;
import androidx.compose.runtime.r;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lf51;", "Lbrg;", "Lxh8;", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f51 extends brg implements xh8 {
    public final g4a V;
    public uqe W;
    public final g4a X;
    public uqe Y;
    public final g4a Z;
    public uqe a0;
    public final t41 b;
    public uqe b0;
    public final g4a c;
    public final g4a c0;
    public uqe d;
    public uqe d0;
    public final g4a e;
    public final g4a e0;
    public uqe f;
    public uqe f0;
    public final g4a g0;
    public uqe h0;
    public final g4a i0;
    public uqe j0;
    public final g4a k0;
    public uqe l0;
    public final g4a m0;
    public final g4a n0;
    public uqe o0;
    public uqe p0;
    public final g4a q0;
    public uqe r0;
    public final g4a s0;
    public uqe t0;

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getCertificationNameSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {169}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new a(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            f51 f51Var;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f51Var = f51.this;
                    t41 t41Var = f51Var.b;
                    String str = this.$input;
                    this.L$0 = f51Var;
                    this.label = 1;
                    obj = t41Var.e(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) this.L$0;
                    r7d.b(obj);
                }
                f51Var.v((List) obj);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting certification name suggestions", false, e);
                f51.this.v(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getCompanySuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {240}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new b(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.f(str, this);
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
                List list = (List) obj;
                f51 f51Var = f51.this;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.e0).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting company suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.e0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getCrowTaxoCertificationsSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {191}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new c(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            f51 f51Var;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f51Var = f51.this;
                    t41 t41Var = f51Var.b;
                    String str = this.$input;
                    this.L$0 = f51Var;
                    this.label = 1;
                    obj = t41Var.g(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) this.L$0;
                    r7d.b(obj);
                }
                f51Var.v((List) obj);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting crowtaxo certification name suggestions", false, e);
                f51.this.v(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getCrowTaxoEducationLevelSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {412}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new d(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            f51 f51Var;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f51Var = f51.this;
                    t41 t41Var = f51Var.b;
                    String str = this.$input;
                    this.L$0 = f51Var;
                    this.label = 1;
                    obj = t41Var.h(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) this.L$0;
                    r7d.b(obj);
                }
                f51Var.w((List) obj);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting crowtaxo education level suggestions", false, e);
                f51.this.w(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getCrowTaxoSkillSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {342}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<String> $existingSkills;
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, List<String> list, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
            this.$existingSkills = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new e(this.$input, this.$existingSkills, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.i(str, this);
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
                f51 f51Var = f51.this;
                List listG = f51.g(f51Var, (List) obj, this.$existingSkills);
                listG.getClass();
                ((gme) f51Var.k0).setValue(listG);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting CrowTaxo skill suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.k0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getEducationLevelSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {389}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, lu2<? super f> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new f(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            f51 f51Var;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f51Var = f51.this;
                    t41 t41Var = f51Var.b;
                    String str = this.$input;
                    this.L$0 = f51Var;
                    this.label = 1;
                    obj = t41Var.j(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) this.L$0;
                    r7d.b(obj);
                }
                f51Var.w((List) obj);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting education level suggestions", false, e);
                f51.this.w(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getFieldsOfStudySuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {436}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new g(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.k(str, this);
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
                List list = (List) obj;
                f51 f51Var = f51.this;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.q0).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting fields of study suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.q0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getInlineSkillSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {316}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<String> $existingSkills;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<String> list, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$existingSkills = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new h(this.$existingSkills, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    this.label = 1;
                    obj = t41Var.i("", this);
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
                f51 f51Var = f51.this;
                ((gme) f51Var.m0).setValue(f51.g(f51Var, (List) obj, this.$existingSkills));
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting inline skill suggestions", false, e);
                ((gme) f51.this.m0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getJobTitleSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {215}, m = "invokeSuspend")
    public static final class i extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, lu2<? super i> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new i(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((i) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.m(str, this);
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
                List list = (List) obj;
                f51 f51Var = f51.this;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.c0).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting job title suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.c0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getLanguageSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {265}, m = "invokeSuspend")
    public static final class j extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, lu2<? super j> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new j(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((j) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.n(str, this);
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
                List list = (List) obj;
                f51 f51Var = f51.this;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.g0).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting language suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.g0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getLicensesNameSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {146}, m = "invokeSuspend")
    public static final class k extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, lu2<? super k> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new k(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((k) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            f51 f51Var;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f51Var = f51.this;
                    t41 t41Var = f51Var.b;
                    String str = this.$input;
                    this.L$0 = f51Var;
                    this.label = 1;
                    obj = t41Var.o(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) this.L$0;
                    r7d.b(obj);
                }
                List list = (List) obj;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.X).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting license name suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.X).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getSchoolSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {461}, m = "invokeSuspend")
    public static final class l extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, lu2<? super l> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new l(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((l) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.t(str, this);
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
                List list = (List) obj;
                f51 f51Var = f51.this;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.s0).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting school suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.s0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$getSkillSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {290}, m = "invokeSuspend")
    public static final class m extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ List<String> $existingSkills;
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, List<String> list, lu2<? super m> lu2Var) {
            super(2, lu2Var);
            this.$input = str;
            this.$existingSkills = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new m(this.$input, this.$existingSkills, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((m) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$input;
                    this.label = 1;
                    obj = t41Var.v(str, this);
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
                f51 f51Var = f51.this;
                List listG = f51.g(f51Var, (List) obj, this.$existingSkills);
                listG.getClass();
                ((gme) f51Var.i0).setValue(listG);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting skill suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.i0).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$updateBranchAutocompleteSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {70}, m = "invokeSuspend")
    public static final class n extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $userInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, lu2<? super n> lu2Var) {
            super(2, lu2Var);
            this.$userInput = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new n(this.$userInput, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((n) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    t41 t41Var = f51.this.b;
                    String str = this.$userInput;
                    this.label = 1;
                    obj = t41Var.r(str, this);
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
                List list = (List) obj;
                f51 f51Var = f51.this;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.e).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "Error getting branch suggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.e).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$updateLocationSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {45}, m = "invokeSuspend")
    public static final class o extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $selectedCountryCode;
        final /* synthetic */ String $userInput;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(lu2 lu2Var, String str, String str2) {
            super(2, lu2Var);
            this.$userInput = str;
            this.$selectedCountryCode = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f51.this.new o(lu2Var, this.$userInput, this.$selectedCountryCode);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((o) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            f51 f51Var;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f51Var = f51.this;
                    t41 t41Var = f51Var.b;
                    String str = this.$userInput;
                    String str2 = this.$selectedCountryCode;
                    this.L$0 = f51Var;
                    this.label = 1;
                    obj = t41Var.p(str, str2, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) this.L$0;
                    r7d.b(obj);
                }
                List list = (List) obj;
                f51Var.getClass();
                list.getClass();
                ((gme) f51Var.c).setValue(list);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.b("AutocompleteSheetViewModel", "getLocationSuggestions", false, e);
                f51 f51Var2 = f51.this;
                f51Var2.getClass();
                ((gme) f51Var2.c).setValue(zr4.a);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.models.AutocompleteSheetViewModel$updateRankAutocompleteSuggestions$1", f = "AutocompleteSheetViewModel.kt", l = {95, 100, 105, 109, 113, 119, 123}, m = "invokeSuspend")
    public static final class p extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $userInput;
        final /* synthetic */ String $userSelectedBranch;
        int label;
        final /* synthetic */ f51 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(f51 f51Var, lu2 lu2Var, String str, String str2) {
            super(2, lu2Var);
            this.$userSelectedBranch = str;
            this.this$0 = f51Var;
            this.$userInput = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new p(this.this$0, lu2Var, this.$userSelectedBranch, this.$userInput);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((p) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0136, code lost:
        
            if (r4 == r1) goto L82;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0116 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000c, B:79:0x0126, B:84:0x013b, B:9:0x0014, B:83:0x0139, B:10:0x0019, B:34:0x007a, B:11:0x001d, B:27:0x005b, B:12:0x0021, B:50:0x00b7, B:13:0x0026, B:73:0x010b, B:14:0x002b, B:60:0x00dd, B:17:0x0033, B:21:0x0040, B:24:0x004a, B:28:0x005f, B:31:0x0069, B:35:0x007e, B:47:0x00a6, B:38:0x0088, B:57:0x00cd, B:41:0x0092, B:44:0x009c, B:51:0x00bb, B:70:0x00fb, B:54:0x00c4, B:61:0x00e0, B:80:0x0129, B:64:0x00e9, B:67:0x00f2, B:74:0x010e, B:76:0x0116), top: B:89:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0125  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f51.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f51(t41 t41Var) {
        t41Var.getClass();
        this.b = t41Var;
        zr4 zr4Var = zr4.a;
        this.c = r.f(zr4Var);
        this.e = r.f(zr4Var);
        this.V = r.f(zr4Var);
        this.X = r.f(zr4Var);
        this.Z = r.f(zr4Var);
        this.c0 = r.f(zr4Var);
        this.e0 = r.f(zr4Var);
        this.g0 = r.f(zr4Var);
        this.i0 = r.f(zr4Var);
        this.k0 = r.f(zr4Var);
        this.m0 = r.f(zr4Var);
        this.n0 = r.f(zr4Var);
        this.q0 = r.f(zr4Var);
        this.s0 = r.f(zr4Var);
    }

    public static final List g(f51 f51Var, List list, List list2) {
        f51Var.getClass();
        if (list2.isEmpty()) {
            return list;
        }
        List list3 = list2;
        ArrayList<String> arrayList = new ArrayList(t92.r0(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(ka2.I((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String strI = ka2.I(((g51) obj).c);
            if (!arrayList.isEmpty()) {
                for (String str : arrayList) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = strI.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase.equals(lowerCase2)) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h(String str) {
        str.getClass();
        uqe uqeVar = this.a0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        v(zr4.a);
        this.a0 = u63.Y(ee3.p(this), null, null, new a(str, null), 3);
    }

    public final void i(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching company suggestions for query: ".concat(str), null);
        uqe uqeVar = this.f0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.e0).setValue(zr4.a);
        this.f0 = u63.Y(ee3.p(this), null, null, new b(str, null), 3);
    }

    public final void j(String str) {
        str.getClass();
        uqe uqeVar = this.b0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        v(zr4.a);
        this.b0 = u63.Y(ee3.p(this), null, null, new c(str, null), 3);
    }

    public final void k(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching crowtaxo education level suggestions for query: ".concat(str), null);
        uqe uqeVar = this.p0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        w(zr4.a);
        this.p0 = u63.Y(ee3.p(this), null, null, new d(str, null), 3);
    }

    public final void l(String str, List<String> list) {
        str.getClass();
        list.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching CrowTaxo skill suggestions for query: ".concat(str), null);
        uqe uqeVar = this.l0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.k0).setValue(zr4.a);
        this.l0 = u63.Y(ee3.p(this), null, null, new e(str, list, null), 3);
    }

    public final void m(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching education level suggestions for query: ".concat(str), null);
        uqe uqeVar = this.o0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        w(zr4.a);
        this.o0 = u63.Y(ee3.p(this), null, null, new f(str, null), 3);
    }

    public final void n(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching fields of study suggestions for query: ".concat(str), null);
        uqe uqeVar = this.r0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.q0).setValue(zr4.a);
        this.r0 = u63.Y(ee3.p(this), null, null, new g(str, null), 3);
    }

    public final void o(List<String> list) {
        list.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching inline skill suggestions", null);
        u63.Y(ee3.p(this), null, null, new h(list, null), 3);
    }

    public final void p(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching job title suggestions for query: ".concat(str), null);
        uqe uqeVar = this.d0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.c0).setValue(zr4.a);
        this.d0 = u63.Y(ee3.p(this), null, null, new i(str, null), 3);
    }

    public final void q(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching language suggestions for query: ".concat(str), null);
        uqe uqeVar = this.h0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.g0).setValue(zr4.a);
        this.h0 = u63.Y(ee3.p(this), null, null, new j(str, null), 3);
    }

    public final void r(String str) {
        str.getClass();
        uqe uqeVar = this.Y;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.X).setValue(zr4.a);
        this.Y = u63.Y(ee3.p(this), null, null, new k(str, null), 3);
    }

    public final List<g51> s() {
        return (List) ((gme) this.c).getValue();
    }

    public final void t(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching school suggestions for query: ".concat(str), null);
        uqe uqeVar = this.t0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.s0).setValue(zr4.a);
        this.t0 = u63.Y(ee3.p(this), null, null, new l(str, null), 3);
    }

    public final void u(String str, List<String> list) {
        str.getClass();
        list.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("AutocompleteSheetViewModel", "Fetching skill suggestions for query: ".concat(str), null);
        uqe uqeVar = this.j0;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.i0).setValue(zr4.a);
        this.j0 = u63.Y(ee3.p(this), null, null, new m(str, list, null), 3);
    }

    public final void v(List<g51> list) {
        list.getClass();
        ((gme) this.Z).setValue(list);
    }

    public final void w(List<g51> list) {
        list.getClass();
        ((gme) this.n0).setValue(list);
    }

    public final void x(String str) {
        str.getClass();
        uqe uqeVar = this.f;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.e).setValue(zr4.a);
        this.f = u63.Y(ee3.p(this), null, null, new n(str, null), 3);
    }

    public final void y(String str, String str2) {
        str.getClass();
        uqe uqeVar = this.d;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.c).setValue(zr4.a);
        this.d = u63.Y(ee3.p(this), null, null, new o(null, str, str2), 3);
    }

    public final void z(String str, String str2) {
        str.getClass();
        str2.getClass();
        uqe uqeVar = this.W;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        ((gme) this.V).setValue(zr4.a);
        this.W = u63.Y(ee3.p(this), null, null, new p(this, null, str2, str), 3);
    }

    public f51() {
        this(new t41(jz0.a()));
    }
}
