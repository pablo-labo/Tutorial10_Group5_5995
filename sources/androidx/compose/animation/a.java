package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.e;
import defpackage.ad0;
import defpackage.bd0;
import defpackage.bh2;
import defpackage.c20;
import defpackage.csf;
import defpackage.dd0;
import defpackage.gme;
import defpackage.it2;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.ku4;
import defpackage.lv4;
import defpackage.mj8;
import defpackage.r25;
import defpackage.tie;
import defpackage.wl7;
import defpackage.wu5;
import defpackage.xu5;
import defpackage.zd0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: androidx.compose.animation.a$a, reason: collision with other inner class name */
    public static final class C0011a<S> extends mj8 implements Function1<dd0<S>, it2> {
        public static final C0011a a = new C0011a(1);

        @Override // kotlin.jvm.functions.Function1
        public final it2 invoke(Object obj) {
            return a.c(ku4.d(zd0.d(220, 90, null, 4), 2).b(ku4.f(zd0.d(220, 90, null, 4))), ku4.e(zd0.d(90, 0, null, 6), 2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class b<S> extends mj8 implements Function1<S, S> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s) {
            return s;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ xu5<bd0, S, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<S, Object> $contentKey;
        final /* synthetic */ String $label;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Function1<dd0<S>, it2> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(S s, androidx.compose.ui.e eVar, Function1<? super dd0<S>, it2> function1, c20 c20Var, String str, Function1<? super S, ? extends Object> function12, xu5<? super bd0, ? super S, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var, int i, int i2) {
            super(2);
            this.$targetState = s;
            this.$modifier = eVar;
            this.$transitionSpec = function1;
            this.$contentAlignment = c20Var;
            this.$label = str;
            this.$contentKey = function12;
            this.$content = xu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            a.b(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$contentKey, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class d<S> extends mj8 implements Function1<dd0<S>, it2> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final it2 invoke(Object obj) {
            return a.c(ku4.d(zd0.d(220, 90, null, 4), 2).b(ku4.f(zd0.d(220, 90, null, 4))), ku4.e(zd0.d(90, 0, null, 6), 2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class e<S> extends mj8 implements Function1<S, S> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s) {
            return s;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ xu5<bd0, S, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
        final /* synthetic */ S $stateForContent;
        final /* synthetic */ csf<S> $this_AnimatedContent;
        final /* synthetic */ Function1<dd0<S>, it2> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(csf<S> csfVar, S s, Function1<? super dd0<S>, it2> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, xu5<? super bd0, ? super S, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var) {
            super(2);
            this.$this_AnimatedContent = csfVar;
            this.$stateForContent = s;
            this.$transitionSpec = function1;
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$currentlyVisible = snapshotStateList;
            this.$content = xu5Var;
        }

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
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                Function1<dd0<S>, it2> function1 = this.$transitionSpec;
                dd0 dd0Var = this.$rootScope;
                it2 it2VarV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (it2VarV == c0020a) {
                    it2VarV = function1.invoke(dd0Var);
                    bVar2.p(it2VarV);
                }
                it2 it2Var = (it2) it2VarV;
                boolean zA = bVar2.a(wl7.b(this.$this_AnimatedContent.f().a(), this.$stateForContent));
                csf<S> csfVar = this.$this_AnimatedContent;
                S s = this.$stateForContent;
                Function1<dd0<S>, it2> function12 = this.$transitionSpec;
                dd0 dd0Var2 = this.$rootScope;
                Object objV = bVar2.v();
                if (zA || objV == c0020a) {
                    objV = wl7.b(csfVar.f().a(), s) ? r25.a : function12.invoke(dd0Var2).b;
                    bVar2.p(objV);
                }
                r25 r25Var = (r25) objV;
                S s2 = this.$stateForContent;
                csf<S> csfVar2 = this.$this_AnimatedContent;
                Object objV2 = bVar2.v();
                if (objV2 == c0020a) {
                    objV2 = new AnimatedContentTransitionScopeImpl.a(wl7.b(s2, ((gme) csfVar2.d).getValue()));
                    bVar2.p(objV2);
                }
                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objV2;
                lv4 lv4Var = it2Var.a;
                boolean zX = bVar2.x(it2Var);
                Object objV3 = bVar2.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new androidx.compose.animation.c(it2Var);
                    bVar2.p(objV3);
                }
                androidx.compose.ui.e eVarA = androidx.compose.ui.layout.i.a(e.a.b, (wu5) objV3);
                ((gme) aVar.b).setValue(Boolean.valueOf(wl7.b(this.$stateForContent, ((gme) this.$this_AnimatedContent.d).getValue())));
                androidx.compose.ui.e eVarO = eVarA.o(aVar);
                csf<S> csfVar3 = this.$this_AnimatedContent;
                boolean zX2 = bVar2.x(this.$stateForContent);
                S s3 = this.$stateForContent;
                Object objV4 = bVar2.v();
                if (zX2 || objV4 == c0020a) {
                    objV4 = new androidx.compose.animation.d(s3);
                    bVar2.p(objV4);
                }
                Function1 function13 = (Function1) objV4;
                boolean zK = bVar2.K(r25Var);
                Object objV5 = bVar2.v();
                if (zK || objV5 == c0020a) {
                    objV5 = new androidx.compose.animation.e(r25Var);
                    bVar2.p(objV5);
                }
                i.a(csfVar3, function13, eVarO, lv4Var, r25Var, (Function2) objV5, bh2.c(-143346359, new androidx.compose.animation.g(this.$currentlyVisible, this.$stateForContent, this.$rootScope, this.$content), bVar2), bVar2, 12582912, 64);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ xu5<bd0, S, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ Function1<S, Object> $contentKey;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ csf<S> $this_AnimatedContent;
        final /* synthetic */ Function1<dd0<S>, it2> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(csf<S> csfVar, androidx.compose.ui.e eVar, Function1<? super dd0<S>, it2> function1, c20 c20Var, Function1<? super S, ? extends Object> function12, xu5<? super bd0, ? super S, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var, int i, int i2) {
            super(2);
            this.$this_AnimatedContent = csfVar;
            this.$modifier = eVar;
            this.$transitionSpec = function1;
            this.$contentAlignment = c20Var;
            this.$contentKey = function12;
            this.$content = xu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            a.a(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r2v25, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r2v26, types: [androidx.compose.runtime.b, androidx.compose.runtime.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r5v24, types: [androidx.compose.runtime.snapshots.SnapshotStateList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void a(defpackage.csf<S> r21, androidx.compose.ui.e r22, kotlin.jvm.functions.Function1<? super defpackage.dd0<S>, defpackage.it2> r23, defpackage.c20 r24, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r25, defpackage.xu5<? super defpackage.bd0, ? super S, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r26, androidx.compose.runtime.b r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.a(csf, androidx.compose.ui.e, kotlin.jvm.functions.Function1, c20, kotlin.jvm.functions.Function1, xu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void b(S r19, androidx.compose.ui.e r20, kotlin.jvm.functions.Function1<? super defpackage.dd0<S>, defpackage.it2> r21, defpackage.c20 r22, java.lang.String r23, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r24, defpackage.xu5<? super defpackage.bd0, ? super S, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r25, androidx.compose.runtime.b r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.b(java.lang.Object, androidx.compose.ui.e, kotlin.jvm.functions.Function1, c20, java.lang.String, kotlin.jvm.functions.Function1, xu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final it2 c(lv4 lv4Var, r25 r25Var) {
        return new it2(lv4Var, r25Var, 0.0f, new tie(ad0.a));
    }
}
