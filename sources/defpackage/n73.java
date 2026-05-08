package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.csf;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.wle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n73 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ jf5<Float> $animationSpec;
        final /* synthetic */ wu5<T, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ String $label;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ T $targetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T t, androidx.compose.ui.e eVar, jf5<Float> jf5Var, String str, wu5<? super T, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$targetState = t;
            this.$modifier = eVar;
            this.$animationSpec = jf5Var;
            this.$label = str;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            n73.b(this.$targetState, this.$modifier, this.$animationSpec, this.$label, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends mj8 implements Function1<T, T> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> extends mj8 implements Function1<T, Boolean> {
        final /* synthetic */ csf<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(csf<T> csfVar) {
            super(1);
            this.$this_Crossfade = csfVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!wl7.b(obj, ((gme) this.$this_Crossfade.d).getValue()));
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ jf5<Float> $animationSpec;
        final /* synthetic */ wu5<T, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ T $stateForContent;
        final /* synthetic */ csf<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(csf<T> csfVar, jf5<Float> jf5Var, T t, wu5<? super T, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$this_Crossfade = csfVar;
            this.$animationSpec = jf5Var;
            this.$stateForContent = t;
            this.$content = wu5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            Object objA;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                csf<T> csfVar = this.$this_Crossfade;
                p73 p73Var = new p73(this.$animationSpec);
                T t = this.$stateForContent;
                mvf mvfVar = q92.c0;
                boolean zH = csfVar.h();
                rsf<S> rsfVar = csfVar.a;
                Object obj = b.a.a;
                if (zH) {
                    bVar2.L(1666853325);
                    bVar2.F();
                    objA = rsfVar.a();
                } else {
                    bVar2.L(1666599280);
                    boolean zK = bVar2.K(csfVar);
                    objA = bVar2.v();
                    if (zK || objA == obj) {
                        wle.e.getClass();
                        wle wleVarA = wle.a.a();
                        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
                        wle wleVarB = wle.a.b(wleVarA);
                        try {
                            Object objA2 = rsfVar.a();
                            wle.a.e(wleVarA, wleVarB, function1E);
                            bVar2.p(objA2);
                            objA = objA2;
                        } catch (Throwable th) {
                            wle.a.e(wleVarA, wleVarB, function1E);
                            throw th;
                        }
                    }
                    bVar2.F();
                }
                bVar2.L(1378811975);
                float f = wl7.b(objA, t) ? 1.0f : 0.0f;
                bVar2.F();
                Float fValueOf = Float.valueOf(f);
                boolean zK2 = bVar2.K(csfVar);
                Object objV = bVar2.v();
                if (zK2 || objV == obj) {
                    objV = r.c(new q73(csfVar, 0));
                    bVar2.p(objV);
                }
                Object value = ((ese) objV).getValue();
                bVar2.L(1378811975);
                float f2 = wl7.b(value, t) ? 1.0f : 0.0f;
                bVar2.F();
                Float fValueOf2 = Float.valueOf(f2);
                boolean zK3 = bVar2.K(csfVar);
                Object objV2 = bVar2.v();
                if (zK3 || objV2 == obj) {
                    objV2 = r.c(new r73(csfVar));
                    bVar2.p(objV2);
                }
                csf.d dVarC = msf.c(csfVar, fValueOf, fValueOf2, p73Var.q(((ese) objV2).getValue(), bVar2, 0), mvfVar, bVar2, 0);
                boolean zK4 = bVar2.K(dVarC);
                Object objV3 = bVar2.v();
                if (zK4 || objV3 == obj) {
                    objV3 = new o73(dVarC);
                    bVar2.p(objV3);
                }
                androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.a.a(e.a.b, (Function1) objV3);
                wu5<T, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$content;
                T t2 = this.$stateForContent;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
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
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                wu5Var.q(t2, bVar2, 0);
                bVar2.q();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ jf5<Float> $animationSpec;
        final /* synthetic */ wu5<T, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ Function1<T, Object> $contentKey;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ csf<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(csf<T> csfVar, androidx.compose.ui.e eVar, jf5<Float> jf5Var, Function1<? super T, ? extends Object> function1, wu5<? super T, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$this_Crossfade = csfVar;
            this.$modifier = eVar;
            this.$animationSpec = jf5Var;
            this.$contentKey = function1;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            n73.a(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void a(defpackage.csf<T> r16, androidx.compose.ui.e r17, defpackage.jf5<java.lang.Float> r18, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r19, defpackage.wu5<? super T, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r20, androidx.compose.runtime.b r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n73.a(csf, androidx.compose.ui.e, jf5, kotlin.jvm.functions.Function1, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void b(T r15, androidx.compose.ui.e r16, defpackage.jf5<java.lang.Float> r17, java.lang.String r18, defpackage.wu5<? super T, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r19, androidx.compose.runtime.b r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n73.b(java.lang.Object, androidx.compose.ui.e, jf5, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }
}
