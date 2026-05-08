package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.kv5;
import defpackage.slg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mv5 extends dj3 implements kv5 {
    public ui8 V;
    public List<hsc> W;
    public hsc X;
    public hsc Y;
    public ax9 Z;
    public e04 a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public List<rxf> e;
    public boolean e0;
    public List<rlg> f;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public Collection<? extends kv5> n0;
    public volatile lv5 o0;
    public final kv5 p0;
    public final hv1.a q0;
    public kv5 r0;
    public Map<fv1.a<?>, Object> s0;

    public class a implements kv5.a<kv5> {
        public byf a;
        public aj3 b;
        public ax9 c;
        public e04 d;
        public kv5 e;
        public hv1.a f;
        public List<rlg> g;
        public final List<hsc> h;
        public hsc i;
        public hsc j;
        public ui8 k;
        public n8a l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public zr4 r;
        public lf0 s;
        public boolean t;
        public final LinkedHashMap u;
        public Boolean v;
        public boolean w;
        public final /* synthetic */ mv5 x;

        public a(mv5 mv5Var, byf byfVar, aj3 aj3Var, ax9 ax9Var, e04 e04Var, hv1.a aVar, List list, List list2, hsc hscVar, ui8 ui8Var) {
            if (byfVar == null) {
                s(0);
                throw null;
            }
            if (aj3Var == null) {
                s(1);
                throw null;
            }
            if (ax9Var == null) {
                s(2);
                throw null;
            }
            if (e04Var == null) {
                s(3);
                throw null;
            }
            if (aVar == null) {
                s(4);
                throw null;
            }
            if (list == null) {
                s(5);
                throw null;
            }
            if (list2 == null) {
                s(6);
                throw null;
            }
            if (ui8Var == null) {
                s(7);
                throw null;
            }
            this.x = mv5Var;
            this.e = null;
            this.j = mv5Var.Y;
            this.m = true;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = mv5Var.i0;
            this.r = null;
            this.s = null;
            this.t = mv5Var.j0;
            this.u = new LinkedHashMap();
            this.v = null;
            this.w = false;
            this.a = byfVar;
            this.b = aj3Var;
            this.c = ax9Var;
            this.d = e04Var;
            this.f = aVar;
            this.g = list;
            this.h = list2;
            this.i = hscVar;
            this.k = ui8Var;
            this.l = null;
        }

        public static /* synthetic */ void s(int i) {
            String str;
            int i2;
            switch (i) {
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case DatadogLogGenerator.CRASH /* 9 */:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i) {
                case DatadogLogGenerator.CRASH /* 9 */:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kv5.a
        public final kv5.a a(List list) {
            this.g = list;
            return this;
        }

        @Override // kv5.a
        public final kv5.a b(e04 e04Var) {
            if (e04Var != null) {
                this.d = e04Var;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // kv5.a
        public final kv5 build() {
            return this.x.N0(this);
        }

        @Override // kv5.a
        public final kv5.a c(hsc hscVar) {
            this.j = hscVar;
            return this;
        }

        @Override // kv5.a
        public final kv5.a d(byf byfVar) {
            if (byfVar != null) {
                this.a = byfVar;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a e() {
            this.t = true;
            return this;
        }

        @Override // kv5.a
        public final kv5.a f(lf0 lf0Var) {
            if (lf0Var != null) {
                this.s = lf0Var;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a g() {
            this.m = false;
            return this;
        }

        @Override // kv5.a
        public final kv5.a h(ax9 ax9Var) {
            if (ax9Var != null) {
                this.c = ax9Var;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a i() {
            this.r = zr4.a;
            return this;
        }

        @Override // kv5.a
        public final kv5.a j() {
            this.q = true;
            return this;
        }

        @Override // kv5.a
        public final kv5.a k(aj3 aj3Var) {
            if (aj3Var != null) {
                this.b = aj3Var;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a l(m52 m52Var) {
            this.e = m52Var;
            return this;
        }

        @Override // kv5.a
        public final kv5.a m(hv1.a aVar) {
            if (aVar != null) {
                this.f = aVar;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a n() {
            this.o = true;
            return this;
        }

        @Override // kv5.a
        public final kv5.a o() {
            this.u.put(iv7.w0, Boolean.TRUE);
            return this;
        }

        @Override // kv5.a
        public final kv5.a p(ui8 ui8Var) {
            if (ui8Var != null) {
                this.k = ui8Var;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a q(n8a n8aVar) {
            if (n8aVar != null) {
                this.l = n8aVar;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // kv5.a
        public final kv5.a r() {
            this.n = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv5(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        super(aj3Var, lf0Var, n8aVar, qneVar);
        if (aj3Var == null) {
            D0(0);
            throw null;
        }
        if (lf0Var == null) {
            D0(1);
            throw null;
        }
        if (n8aVar == null) {
            D0(2);
            throw null;
        }
        if (aVar == null) {
            D0(3);
            throw null;
        }
        if (qneVar == null) {
            D0(4);
            throw null;
        }
        this.a0 = d04.i;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.l0 = true;
        this.m0 = false;
        this.n0 = null;
        this.o0 = null;
        this.r0 = null;
        this.s0 = null;
        this.p0 = kv5Var == null ? this : kv5Var;
        this.q0 = aVar;
    }

    public static /* synthetic */ void D0(int i) {
        String str;
        int i2;
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case RendererMetrics.SAMPLES /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case RendererMetrics.SAMPLES /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case DatadogLogGenerator.CRASH /* 9 */:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ArrayList O0(kv5 kv5Var, List list, TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            D0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rlg rlgVar = (rlg) it.next();
            ui8 type = rlgVar.getType();
            ylg ylgVar = ylg.IN_VARIANCE;
            ui8 ui8VarJ = typeSubstitutor.j(type, ylgVar);
            ui8 ui8VarU0 = rlgVar.u0();
            ui8 ui8VarJ2 = ui8VarU0 == null ? null : typeSubstitutor.j(ui8VarU0, ylgVar);
            if (ui8VarJ == null) {
                return null;
            }
            int i = 1;
            if ((ui8VarJ != rlgVar.getType() || ui8VarU0 != ui8VarJ2) && zArr != null) {
                zArr[0] = true;
            }
            h14 h14Var = rlgVar instanceof slg.a ? new h14((List) ((slg.a) rlgVar).a0.getValue(), i) : null;
            rlg rlgVar2 = z ? null : rlgVar;
            int index = rlgVar.getIndex();
            lf0 annotations = rlgVar.getAnnotations();
            n8a name = rlgVar.getName();
            boolean zZ0 = rlgVar.z0();
            boolean zQ0 = rlgVar.q0();
            boolean zP0 = rlgVar.p0();
            qne qneVarG = z2 ? rlgVar.g() : qne.p;
            annotations.getClass();
            name.getClass();
            qneVarG.getClass();
            arrayList.add(h14Var == null ? new slg(kv5Var, rlgVar2, index, annotations, name, ui8VarJ, zZ0, zQ0, zP0, ui8VarJ2, qneVarG) : new slg.a(kv5Var, rlgVar2, index, annotations, name, ui8VarJ, zZ0, zQ0, zP0, ui8VarJ2, qneVarG, h14Var));
        }
        return arrayList;
    }

    public boolean B() {
        return this.f0;
    }

    @Override // defpackage.kv5
    public final boolean B0() {
        return this.i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hv1
    public void C0(Collection<? extends hv1> collection) {
        if (collection == 0) {
            D0(17);
            throw null;
        }
        this.n0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((kv5) it.next()).E0()) {
                this.j0 = true;
                return;
            }
        }
    }

    @Override // defpackage.kv5
    public final boolean E0() {
        return this.j0;
    }

    @Override // defpackage.kv5
    public kv5.a<? extends kv5> F0() {
        return Q0(TypeSubstitutor.b);
    }

    @Override // defpackage.fv1
    public final hsc L() {
        return this.Y;
    }

    public kv5 L0(aj3 aj3Var, ax9 ax9Var, e04 e04Var) {
        kv5 kv5VarBuild = F0().k(aj3Var).h(ax9Var).b(e04Var).m(hv1.a.b).g().build();
        if (kv5VarBuild != null) {
            return kv5VarBuild;
        }
        D0(26);
        throw null;
    }

    public abstract mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar);

    /* JADX WARN: Removed duplicated region for block: B:103:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.mv5 N0(mv5.a r23) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv5.N0(mv5$a):mv5");
    }

    @Override // defpackage.fv1
    public final hsc O() {
        return this.X;
    }

    public void P0(hsc hscVar, hsc hscVar2, List list, List list2, List list3, ui8 ui8Var, ax9 ax9Var, e04 e04Var) {
        if (list == null) {
            D0(5);
            throw null;
        }
        if (list2 == null) {
            D0(6);
            throw null;
        }
        if (list3 == null) {
            D0(7);
            throw null;
        }
        if (e04Var == null) {
            D0(8);
            throw null;
        }
        this.e = z92.z1(list2);
        this.f = z92.z1(list3);
        this.V = ui8Var;
        this.Z = ax9Var;
        this.a0 = e04Var;
        this.X = hscVar;
        this.Y = hscVar2;
        this.W = list;
        for (int i = 0; i < list2.size(); i++) {
            rxf rxfVar = (rxf) list2.get(i);
            if (rxfVar.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(rxfVar);
                int index = rxfVar.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            rlg rlgVar = (rlg) list3.get(i2);
            if (rlgVar.getIndex() != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(rlgVar);
                int index2 = rlgVar.getIndex();
                sb2.append("index is ");
                sb2.append(index2);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final a Q0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new a(this, typeSubstitutor.g(), d(), r(), getVisibility(), f(), i(), w0(), this.X, getReturnType());
        }
        D0(24);
        throw null;
    }

    public final <V> void R0(fv1.a<V> aVar, Object obj) {
        if (this.s0 == null) {
            this.s0 = new LinkedHashMap();
        }
        this.s0.put(aVar, obj);
    }

    public void S0(boolean z) {
        this.l0 = z;
    }

    public void T0(boolean z) {
        this.m0 = z;
    }

    public final void U0(mge mgeVar) {
        if (mgeVar != null) {
            this.V = mgeVar;
        } else {
            D0(11);
            throw null;
        }
    }

    @Override // defpackage.zm9
    public final boolean X() {
        return this.h0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kv5] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public kv5 a() {
        kv5 kv5Var = this.p0;
        ?? A = this;
        if (kv5Var != this) {
            A = kv5Var.a();
        }
        if (A != 0) {
            return A;
        }
        D0(20);
        throw null;
    }

    @Override // defpackage.qxe
    public kv5 b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            D0(22);
            throw null;
        }
        if (typeSubstitutor.a.e()) {
            return this;
        }
        a aVarQ0 = Q0(typeSubstitutor);
        aVarQ0.e = a();
        aVarQ0.o = true;
        aVarQ0.w = true;
        return aVarQ0.x.N0(aVarQ0);
    }

    @Override // defpackage.hv1
    public final hv1.a f() {
        hv1.a aVar = this.q0;
        if (aVar != null) {
            return aVar;
        }
        D0(21);
        throw null;
    }

    public boolean g0() {
        return this.m0;
    }

    @Override // defpackage.fv1
    public ui8 getReturnType() {
        return this.V;
    }

    @Override // defpackage.fv1
    public final List<rxf> getTypeParameters() {
        List<rxf> list = this.e;
        if (list != null) {
            return list;
        }
        bg.n(this, "typeParameters == null for ");
        return null;
    }

    @Override // defpackage.fj3
    public final e04 getVisibility() {
        e04 e04Var = this.a0;
        if (e04Var != null) {
            return e04Var;
        }
        D0(16);
        throw null;
    }

    @Override // defpackage.fv1
    public final List<rlg> i() {
        List<rlg> list = this.f;
        if (list != null) {
            return list;
        }
        D0(19);
        throw null;
    }

    @Override // defpackage.zm9
    public final boolean i0() {
        return this.g0;
    }

    public boolean isExternal() {
        return this.d0;
    }

    @Override // defpackage.kv5
    public final boolean isInfix() {
        if (this.c0) {
            return true;
        }
        Iterator<? extends hv1> it = a().m().iterator();
        while (it.hasNext()) {
            if (((kv5) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.e0;
    }

    @Override // defpackage.kv5
    public final boolean isOperator() {
        if (this.b0) {
            return true;
        }
        Iterator<? extends hv1> it = a().m().iterator();
        while (it.hasNext()) {
            if (((kv5) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.k0;
    }

    @Override // defpackage.fv1
    public <V> V j0(fv1.a<V> aVar) {
        Map<fv1.a<?>, Object> map = this.s0;
        if (map == null) {
            return null;
        }
        return (V) map.get(aVar);
    }

    @Override // defpackage.hv1
    public Collection<? extends kv5> m() {
        lv5 lv5Var = this.o0;
        if (lv5Var != null) {
            this.n0 = lv5Var.invoke();
            this.o0 = null;
        }
        Collection<? extends kv5> collection = this.n0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        D0(14);
        throw null;
    }

    @Override // defpackage.aj3
    public <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return ej3Var.g(this, d);
    }

    @Override // defpackage.zm9
    public final ax9 r() {
        ax9 ax9Var = this.Z;
        if (ax9Var != null) {
            return ax9Var;
        }
        D0(15);
        throw null;
    }

    @Override // defpackage.kv5
    public final kv5 s0() {
        return this.r0;
    }

    @Override // defpackage.fv1
    public final List<hsc> w0() {
        List<hsc> list = this.W;
        if (list != null) {
            return list;
        }
        D0(13);
        throw null;
    }
}
