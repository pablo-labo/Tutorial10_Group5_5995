package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.d;
import androidx.navigation.k;
import defpackage.kv8;
import defpackage.n44;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f44 {

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ androidx.navigation.d $backStackEntry;
        final /* synthetic */ n44 $dialogNavigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n44 n44Var, androidx.navigation.d dVar) {
            super(0);
            this.$dialogNavigator = n44Var;
            this.$backStackEntry = dVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$dialogNavigator.i(this.$backStackEntry, false);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ androidx.navigation.d $backStackEntry;
        final /* synthetic */ n44.a $destination;
        final /* synthetic */ n44 $dialogNavigator;
        final /* synthetic */ SnapshotStateList<androidx.navigation.d> $dialogsToDispose;
        final /* synthetic */ ekd $saveableStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.navigation.d dVar, n44 n44Var, hkd hkdVar, SnapshotStateList snapshotStateList, n44.a aVar) {
            super(2);
            this.$backStackEntry = dVar;
            this.$dialogNavigator = n44Var;
            this.$saveableStateHolder = hkdVar;
            this.$dialogsToDispose = snapshotStateList;
            this.$destination = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.navigation.d dVar = this.$backStackEntry;
                boolean zX = bVar2.x(dVar) | bVar2.K(this.$dialogNavigator);
                SnapshotStateList<androidx.navigation.d> snapshotStateList = this.$dialogsToDispose;
                androidx.navigation.d dVar2 = this.$backStackEntry;
                n44 n44Var = this.$dialogNavigator;
                Object objV = bVar2.v();
                if (zX || objV == b.a.a) {
                    objV = new h44(n44Var, snapshotStateList, dVar2);
                    bVar2.p(objV);
                }
                to4.b(dVar, (Function1) objV, bVar2);
                androidx.navigation.d dVar3 = this.$backStackEntry;
                paa.a(dVar3, this.$saveableStateHolder, bh2.c(-497631156, new i44(this.$destination, dVar3), bVar2), bVar2, 384);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ n44 $dialogNavigator;
        final /* synthetic */ SnapshotStateList<androidx.navigation.d> $dialogsToDispose;
        final /* synthetic */ ese<Set<androidx.navigation.d>> $transitionInProgress$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ese<? extends Set<androidx.navigation.d>> eseVar, n44 n44Var, SnapshotStateList<androidx.navigation.d> snapshotStateList, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$transitionInProgress$delegate = eseVar;
            this.$dialogNavigator = n44Var;
            this.$dialogsToDispose = snapshotStateList;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            Set<androidx.navigation.d> value = this.$transitionInProgress$delegate.getValue();
            n44 n44Var = this.$dialogNavigator;
            SnapshotStateList<androidx.navigation.d> snapshotStateList = this.$dialogsToDispose;
            for (androidx.navigation.d dVar : value) {
                if (!((List) n44Var.b().e.a.getValue()).contains(dVar) && !snapshotStateList.contains(dVar)) {
                    n44Var.b().b(dVar);
                }
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ n44 $dialogNavigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n44 n44Var, int i) {
            super(2);
            this.$dialogNavigator = n44Var;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            f44.a(this.$dialogNavigator, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ androidx.navigation.d $entry;
        final /* synthetic */ boolean $isInspecting;
        final /* synthetic */ List<androidx.navigation.d> $this_PopulateVisibleList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.navigation.d dVar, List list, boolean z) {
            super(1);
            this.$entry = dVar;
            this.$isInspecting = z;
            this.$this_PopulateVisibleList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [j44, yv8] */
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
        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            final boolean z = this.$isInspecting;
            final List<androidx.navigation.d> list = this.$this_PopulateVisibleList;
            final androidx.navigation.d dVar = this.$entry;
            ?? r2 = new uv8() { // from class: j44
                @Override // defpackage.uv8
                public final void G(zv8 zv8Var, kv8.a aVar) {
                    boolean z2 = z;
                    List list2 = list;
                    d dVar2 = dVar;
                    if (z2 && !list2.contains(dVar2)) {
                        list2.add(dVar2);
                    }
                    if (aVar == kv8.a.ON_START && !list2.contains(dVar2)) {
                        list2.add(dVar2);
                    }
                    if (aVar == kv8.a.ON_STOP) {
                        list2.remove(dVar2);
                    }
                }
            };
            dVar.W.a(r2);
            return new k44(this.$entry, r2);
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Collection<androidx.navigation.d> $backStack;
        final /* synthetic */ List<androidx.navigation.d> $this_PopulateVisibleList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<androidx.navigation.d> list, Collection<androidx.navigation.d> collection, int i) {
            super(2);
            this.$this_PopulateVisibleList = list;
            this.$backStack = collection;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            f44.b(this.$this_PopulateVisibleList, this.$backStack, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(n44 n44Var, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVarH = bVar.h(294589392);
        int i2 = (i & 6) == 0 ? (cVarH.K(n44Var) ? 4 : 2) | i : i;
        if ((i2 & 3) == 2 && cVarH.i()) {
            cVarH.D();
        } else {
            hkd hkdVarY = r03.y(cVarH);
            g4a g4aVarA = r.a(n44Var.b().e, cVarH);
            List list = (List) g4aVarA.getValue();
            boolean zBooleanValue = ((Boolean) cVarH.M(uf7.a)).booleanValue();
            boolean zK = cVarH.K(list);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            Object obj = objV;
            if (zK || objV == c0020a) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    androidx.navigation.d dVar = (androidx.navigation.d) obj2;
                    if (zBooleanValue || dVar.W.d.compareTo(kv8.b.d) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                snapshotStateList.addAll(arrayList);
                cVarH.p(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            boolean z = false;
            b(snapshotStateList2, (List) g4aVarA.getValue(), cVarH, 0);
            g4a g4aVarA2 = r.a(n44Var.b().f, cVarH);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new SnapshotStateList();
                cVarH.p(objV2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objV2;
            cVarH.L(1361037007);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                kse kseVar = (kse) listIterator;
                if (!kseVar.hasNext()) {
                    break;
                }
                androidx.navigation.d dVar2 = (androidx.navigation.d) kseVar.next();
                k kVar = dVar2.b;
                kVar.getClass();
                n44.a aVar = (n44.a) kVar;
                boolean zX = ((i2 & 14) != 4 ? z : true) | cVarH.x(dVar2);
                Object objV3 = cVarH.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new a(n44Var, dVar2);
                    cVarH.p(objV3);
                }
                z60.a((gu5) objV3, aVar.a0, bh2.c(1129586364, new b(dVar2, n44Var, hkdVarY, snapshotStateList3, aVar), cVarH), cVarH, 384, 0);
                g4aVarA2 = g4aVarA2;
                z = z;
            }
            boolean z2 = z;
            g4a g4aVar = g4aVarA2;
            cVarH.U(z2);
            Set set = (Set) g4aVar.getValue();
            boolean zK2 = cVarH.K(g4aVar) | ((i2 & 14) == 4 ? true : z2);
            Object objV4 = cVarH.v();
            if (zK2 || objV4 == c0020a) {
                objV4 = new c(g4aVar, n44Var, snapshotStateList3, null);
                cVarH.p(objV4);
            }
            to4.f(set, snapshotStateList3, (Function2) objV4, cVarH);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d(n44Var, i);
        }
    }

    public static final void b(List<androidx.navigation.d> list, Collection<androidx.navigation.d> collection, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVarH = bVar.h(1537894851);
        int i2 = (i & 6) == 0 ? (cVarH.x(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= cVarH.x(collection) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            boolean zBooleanValue = ((Boolean) cVarH.M(uf7.a)).booleanValue();
            for (androidx.navigation.d dVar : collection) {
                aw8 aw8Var = dVar.W;
                boolean zA = cVarH.a(zBooleanValue) | cVarH.x(list) | cVarH.x(dVar);
                Object objV = cVarH.v();
                if (zA || objV == b.a.a) {
                    objV = new e(dVar, list, zBooleanValue);
                    cVarH.p(objV);
                }
                to4.b(aw8Var, (Function1) objV, cVarH);
            }
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new f(list, collection, i);
        }
    }
}
