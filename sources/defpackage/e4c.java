package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.lf0;
import defpackage.mke;
import defpackage.qne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public class e4c extends xlg implements d4c {
    public final ax9 X;
    public e04 Y;
    public Collection<? extends d4c> Z;
    public final d4c a0;
    public final hv1.a b0;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public List<hsc> h0;
    public hsc i0;
    public hsc j0;
    public ArrayList k0;
    public g4c l0;
    public p4c m0;
    public y85 n0;
    public y85 o0;

    public class a {
        public aj3 a;
        public ax9 b;
        public e04 c;
        public hv1.a e;
        public final hsc h;
        public final n8a i;
        public final ui8 j;
        public d4c d = null;
        public byf f = byf.a;
        public boolean g = true;

        public a() {
            this.a = e4c.this.d();
            this.b = e4c.this.r();
            this.c = e4c.this.getVisibility();
            this.e = e4c.this.f();
            this.h = e4c.this.i0;
            this.i = e4c.this.getName();
            this.j = e4c.this.getType();
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                case 16:
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                case 16:
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [kv5, q4c, x3c] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r17v0 */
        /* JADX WARN: Type inference failed for: r17v1, types: [f4c] */
        /* JADX WARN: Type inference failed for: r17v2 */
        /* JADX WARN: Type inference failed for: r17v3 */
        /* JADX WARN: Type inference failed for: r17v4, types: [p4c] */
        /* JADX WARN: Type inference failed for: r17v5 */
        /* JADX WARN: Type inference failed for: r19v0, types: [e4c, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v20, types: [g4c, x3c] */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r4v12, types: [y85] */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v17, types: [ui8] */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v20 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11, types: [kv5] */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r6v10, types: [y85] */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16, types: [kv5] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v22 */
        /* JADX WARN: Type inference failed for: r9v0, types: [aj3, d4c, e4c, fv1, xlg] */
        public final e4c b() {
            x3 x3Var;
            ?? g4cVar;
            ?? q4cVar;
            TypeSubstitutor typeSubstitutor;
            gu5<sma<up2<?>>> gu5Var;
            isc iscVar;
            isc iscVar2;
            Iterator<hsc> it;
            ui8 ui8Var;
            ui8 ui8VarJ;
            aj3 aj3Var = this.a;
            ax9 ax9Var = this.b;
            e04 e04Var = this.c;
            d4c d4cVar = this.d;
            hv1.a aVar = this.e;
            n8a n8aVar = this.i;
            e4c e4cVar = e4c.this;
            ?? O0 = e4cVar.O0(aj3Var, ax9Var, e04Var, d4cVar, aVar, n8aVar);
            List<rxf> typeParameters = e4cVar.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            TypeSubstitutor typeSubstitutorP = pg8.P(typeParameters, this.f, O0, arrayList);
            ui8 ui8Var2 = this.j;
            ylg ylgVar = ylg.OUT_VARIANCE;
            ui8 ui8VarJ2 = typeSubstitutorP.j(ui8Var2, ylgVar);
            isc iscVar3 = null;
            if (ui8VarJ2 != null) {
                ylg ylgVar2 = ylg.IN_VARIANCE;
                ui8 ui8VarJ3 = typeSubstitutorP.j(ui8Var2, ylgVar2);
                if (ui8VarJ3 != null) {
                    O0.Q0(ui8VarJ3);
                }
                hsc hscVar = this.h;
                if (hscVar != null) {
                    x3 x3VarB = hscVar.b(typeSubstitutorP);
                    if (x3VarB != null) {
                        x3Var = x3VarB;
                    }
                } else {
                    x3Var = null;
                }
                hsc hscVar2 = e4cVar.j0;
                isc iscVar4 = (hscVar2 == null || (ui8VarJ = typeSubstitutorP.j(hscVar2.getType(), ylgVar2)) == null) ? null : new isc(O0, new q45(O0, ui8VarJ, hscVar2.getValue()), hscVar2.getAnnotations());
                ArrayList arrayList2 = new ArrayList();
                Iterator<hsc> it2 = e4cVar.h0.iterator();
                while (it2.hasNext()) {
                    hsc next = it2.next();
                    ui8 ui8VarJ4 = typeSubstitutorP.j(next.getType(), ylgVar2);
                    if (ui8VarJ4 == null) {
                        it = it2;
                        ui8Var = ui8VarJ2;
                        iscVar = iscVar3;
                        iscVar2 = iscVar;
                    } else {
                        iscVar2 = iscVar3;
                        it = it2;
                        ui8Var = ui8VarJ2;
                        iscVar = new isc(O0, new du2(O0, ui8VarJ4, ((l47) next.getValue()).a(), next.getValue()), next.getAnnotations());
                    }
                    if (iscVar != null) {
                        arrayList2.add(iscVar);
                    }
                    ui8VarJ2 = ui8Var;
                    it2 = it;
                    iscVar3 = iscVar2;
                }
                ?? r19 = iscVar3;
                O0.R0(ui8VarJ2, arrayList, x3Var, iscVar4, arrayList2);
                g4c g4cVar2 = e4cVar.l0;
                hv1.a aVar2 = hv1.a.b;
                qne.a aVar3 = qne.p;
                if (g4cVar2 == null) {
                    g4cVar = r19;
                } else {
                    lf0 annotations = g4cVar2.getAnnotations();
                    ax9 ax9Var2 = this.b;
                    e04 visibility = e4cVar.l0.getVisibility();
                    if (this.e == aVar2 && d04.e(visibility.d())) {
                        visibility = d04.h;
                    }
                    e04 e04Var2 = visibility;
                    g4c g4cVar3 = e4cVar.l0;
                    boolean z = g4cVar3.e;
                    boolean z2 = g4cVar3.f;
                    boolean z3 = g4cVar3.X;
                    hv1.a aVar4 = this.e;
                    d4c d4cVar2 = this.d;
                    g4cVar = new g4c(O0, annotations, ax9Var2, e04Var2, z, z2, z3, aVar4, d4cVar2 == null ? r19 : d4cVar2.c(), aVar3);
                }
                if (g4cVar != 0) {
                    g4c g4cVar4 = e4cVar.l0;
                    ui8 ui8Var3 = g4cVar4.b0;
                    g4cVar.a0 = g4cVar4.s0() != null ? g4cVar4.s0().b(typeSubstitutorP) : r19;
                    g4cVar.O0(ui8Var3 != null ? typeSubstitutorP.j(ui8Var3, ylgVar) : r19);
                }
                p4c p4cVar = e4cVar.m0;
                if (p4cVar == null) {
                    q4cVar = r19;
                } else {
                    lf0 annotations2 = p4cVar.getAnnotations();
                    ax9 ax9Var3 = this.b;
                    e04 visibility2 = e4cVar.m0.getVisibility();
                    if (this.e == aVar2 && d04.e(visibility2.d())) {
                        visibility2 = d04.h;
                    }
                    e04 e04Var3 = visibility2;
                    boolean zE = e4cVar.m0.E();
                    boolean zIsExternal = e4cVar.m0.isExternal();
                    boolean zIsInline = e4cVar.m0.isInline();
                    hv1.a aVar5 = this.e;
                    d4c d4cVar3 = this.d;
                    q4cVar = new q4c(O0, annotations2, ax9Var3, e04Var3, zE, zIsExternal, zIsInline, aVar5, d4cVar3 == null ? r19 : d4cVar3.e(), aVar3);
                }
                if (q4cVar != 0) {
                    typeSubstitutor = typeSubstitutorP;
                    List listO0 = mv5.O0(q4cVar, e4cVar.m0.i(), typeSubstitutor, false, false, null);
                    if (listO0 == null) {
                        listO0 = Collections.singletonList(q4c.N0(q4cVar, b04.e(this.a).o(), e4cVar.m0.i().get(0).getAnnotations()));
                    }
                    if (listO0.size() != 1) {
                        bg.h();
                        return r19;
                    }
                    p4c p4cVar2 = e4cVar.m0;
                    if (p4cVar2 == null) {
                        e4c.D0(31);
                        throw r19;
                    }
                    q4cVar.a0 = p4cVar2.s0() != null ? p4cVar2.s0().b(typeSubstitutor) : r19;
                    rlg rlgVar = (rlg) listO0.get(0);
                    if (rlgVar == null) {
                        q4c.D0(6);
                        throw r19;
                    }
                    q4cVar.b0 = rlgVar;
                } else {
                    typeSubstitutor = typeSubstitutorP;
                }
                y85 y85Var = e4cVar.n0;
                ?? y85Var2 = y85Var == null ? r19 : new y85(y85Var.getAnnotations(), O0);
                y85 y85Var3 = e4cVar.o0;
                O0.P0(g4cVar, q4cVar, y85Var2, y85Var3 == null ? r19 : new y85(y85Var3.getAnnotations(), O0));
                if (this.g) {
                    int i = mke.c;
                    mke mkeVarA = mke.b.a();
                    Iterator<? extends d4c> it3 = e4cVar.m().iterator();
                    while (it3.hasNext()) {
                        mkeVarA.add(it3.next().b(typeSubstitutor));
                    }
                    O0.Z = mkeVarA;
                }
                if (e4cVar.b0() && (gu5Var = e4cVar.W) != null) {
                    O0.L0(e4cVar.V, gu5Var);
                }
                return O0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4c(aj3 aj3Var, d4c d4cVar, lf0 lf0Var, ax9 ax9Var, e04 e04Var, boolean z, n8a n8aVar, hv1.a aVar, qne qneVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(aj3Var, lf0Var, n8aVar, z, qneVar);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (ax9Var == null) {
            D0(2);
            throw null;
        }
        if (e04Var == null) {
            D0(3);
            throw null;
        }
        if (n8aVar == null) {
            D0(4);
            throw null;
        }
        if (aVar == null) {
            D0(5);
            throw null;
        }
        if (qneVar == null) {
            D0(6);
            throw null;
        }
        this.Z = null;
        this.h0 = Collections.EMPTY_LIST;
        this.X = ax9Var;
        this.Y = e04Var;
        this.a0 = d4cVar == null ? this : d4cVar;
        this.b0 = aVar;
        this.c0 = z2;
        this.d0 = z3;
        this.e0 = z4;
        this.f0 = z5;
        this.g0 = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void D0(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4c.D0(int):void");
    }

    public static e4c N0(aj3 aj3Var, ax9 ax9Var, e04 e04Var, boolean z, n8a n8aVar, hv1.a aVar, qne qneVar) {
        if (aj3Var == null) {
            D0(7);
            throw null;
        }
        if (e04Var == null) {
            D0(10);
            throw null;
        }
        if (n8aVar == null) {
            D0(11);
            throw null;
        }
        if (qneVar != null) {
            return new e4c(aj3Var, null, lf0.a.a, ax9Var, e04Var, z, n8aVar, aVar, qneVar, false, false, false, false, false);
        }
        D0(13);
        throw null;
    }

    @Override // defpackage.d4c
    public final boolean A() {
        return this.g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hv1
    public final void C0(Collection<? extends hv1> collection) {
        if (collection != 0) {
            this.Z = collection;
        } else {
            D0(40);
            throw null;
        }
    }

    @Override // defpackage.wlg, defpackage.fv1
    public final hsc L() {
        return this.i0;
    }

    @Override // defpackage.hv1
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final e4c Z(aj3 aj3Var, ax9 ax9Var, e04 e04Var) {
        a aVar = new a();
        if (aj3Var == null) {
            a.a(0);
            throw null;
        }
        aVar.a = aj3Var;
        aVar.d = null;
        aVar.b = ax9Var;
        if (e04Var == null) {
            a.a(8);
            throw null;
        }
        aVar.c = e04Var;
        aVar.e = hv1.a.b;
        aVar.g = false;
        e4c e4cVarB = aVar.b();
        if (e4cVarB != null) {
            return e4cVarB;
        }
        D0(42);
        throw null;
    }

    @Override // defpackage.wlg, defpackage.fv1
    public final hsc O() {
        return this.j0;
    }

    public e4c O0(aj3 aj3Var, ax9 ax9Var, e04 e04Var, d4c d4cVar, hv1.a aVar, n8a n8aVar) {
        if (aj3Var == null) {
            D0(32);
            throw null;
        }
        if (ax9Var == null) {
            D0(33);
            throw null;
        }
        if (e04Var == null) {
            D0(34);
            throw null;
        }
        if (aVar == null) {
            D0(35);
            throw null;
        }
        if (n8aVar == null) {
            D0(36);
            throw null;
        }
        return new e4c(aj3Var, d4cVar, getAnnotations(), ax9Var, e04Var, this.f, n8aVar, aVar, qne.p, this.c0, b0(), this.e0, isExternal(), this.g0);
    }

    @Override // defpackage.d4c
    public final y85 P() {
        return this.o0;
    }

    public final void P0(g4c g4cVar, q4c q4cVar, y85 y85Var, y85 y85Var2) {
        this.l0 = g4cVar;
        this.m0 = q4cVar;
        this.n0 = y85Var;
        this.o0 = y85Var2;
    }

    public void Q0(ui8 ui8Var) {
    }

    public final void R0(ui8 ui8Var, List list, hsc hscVar, isc iscVar, List list2) {
        if (ui8Var == null) {
            D0(17);
            throw null;
        }
        if (list == null) {
            D0(18);
            throw null;
        }
        if (list2 == null) {
            D0(19);
            throw null;
        }
        this.e = ui8Var;
        this.k0 = new ArrayList(list);
        this.j0 = iscVar;
        this.i0 = hscVar;
        this.h0 = list2;
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [d4c] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final d4c a() {
        d4c d4cVar = this.a0;
        ?? A = this;
        if (d4cVar != this) {
            A = d4cVar.a();
        }
        if (A != 0) {
            return A;
        }
        D0(38);
        throw null;
    }

    @Override // defpackage.qxe
    public final d4c b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            D0(27);
            throw null;
        }
        if (typeSubstitutor.a.e()) {
            return this;
        }
        a aVar = new a();
        byf byfVarG = typeSubstitutor.g();
        if (byfVarG == null) {
            a.a(15);
            throw null;
        }
        aVar.f = byfVarG;
        aVar.d = a();
        return aVar.b();
    }

    @Override // defpackage.vlg
    public boolean b0() {
        return this.d0;
    }

    @Override // defpackage.d4c
    public final g4c c() {
        return this.l0;
    }

    @Override // defpackage.d4c
    public final p4c e() {
        return this.m0;
    }

    @Override // defpackage.hv1
    public final hv1.a f() {
        hv1.a aVar = this.b0;
        if (aVar != null) {
            return aVar;
        }
        D0(39);
        throw null;
    }

    @Override // defpackage.wlg, defpackage.fv1
    public final ui8 getReturnType() {
        ui8 type = getType();
        if (type != null) {
            return type;
        }
        D0(23);
        throw null;
    }

    @Override // defpackage.wlg, defpackage.fv1
    public final List<rxf> getTypeParameters() {
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            return arrayList;
        }
        bg.n(this, "typeParameters == null for ");
        return null;
    }

    @Override // defpackage.fj3
    public final e04 getVisibility() {
        e04 e04Var = this.Y;
        if (e04Var != null) {
            return e04Var;
        }
        D0(25);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return this.e0;
    }

    @Override // defpackage.zm9
    public boolean isExternal() {
        return this.f0;
    }

    @Override // defpackage.fv1
    public <V> V j0(fv1.a<V> aVar) {
        return null;
    }

    @Override // defpackage.fv1, defpackage.hv1
    public final Collection<? extends d4c> m() {
        Collection<? extends d4c> collection = this.Z;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        D0(41);
        throw null;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.n(this, d);
    }

    @Override // defpackage.zm9
    public final ax9 r() {
        ax9 ax9Var = this.X;
        if (ax9Var != null) {
            return ax9Var;
        }
        D0(24);
        throw null;
    }

    @Override // defpackage.d4c
    public final ArrayList u() {
        ArrayList arrayList = new ArrayList(2);
        g4c g4cVar = this.l0;
        if (g4cVar != null) {
            arrayList.add(g4cVar);
        }
        p4c p4cVar = this.m0;
        if (p4cVar != null) {
            arrayList.add(p4cVar);
        }
        return arrayList;
    }

    @Override // defpackage.d4c
    public final y85 v0() {
        return this.n0;
    }

    @Override // defpackage.fv1
    public final List<hsc> w0() {
        List<hsc> list = this.h0;
        if (list != null) {
            return list;
        }
        D0(22);
        throw null;
    }

    @Override // defpackage.vlg
    public final boolean x0() {
        return this.c0;
    }
}
