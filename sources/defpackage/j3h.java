package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.grg;
import defpackage.ws7;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj3h;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j3h extends w0g {
    public final frg g0 = os5.a(this, fwc.a.b(aub.class), new a(this), new b(this), new c(this));
    public Function2<? super hs7, ? super ws7, j6g> h0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j3h j3hVar) {
            super(0);
            this.$this_activityViewModels = j3hVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j3h j3hVar) {
            super(0);
            this.$this_activityViewModels = j3hVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j3h j3hVar) {
            super(0);
            this.$this_activityViewModels = j3hVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-1365231999);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            vsb vsbVarL = Q().l();
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new dd(this, 22);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new f76(this, i3);
                cVarH.p(objV2);
            }
            o3h.a(vsbVarL, gu5Var, (wu5) objV2, Q().p(), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(this, i, 14);
        }
    }

    public final aub Q() {
        return (aub) this.g0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Set setE1;
        ArrayList arrayList;
        Set setE12;
        ArrayList arrayList2;
        Set setE13;
        sjb sjbVar;
        String[] stringArray;
        sjb sjbVar2;
        String[] stringArray2;
        sjb sjbVar3;
        String[] stringArray3;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            ArrayList arrayList3 = null;
            if (arguments == null || !arguments.containsKey("KEY_DAYS_SET") || (stringArray3 = arguments.getStringArray("KEY_DAYS_SET")) == null) {
                setE1 = null;
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (String str : stringArray3) {
                    str.getClass();
                    ws7.a aVarValueOf = ws7.a.valueOf(str);
                    if (aVarValueOf != null) {
                        arrayList4.add(aVarValueOf);
                    }
                }
                setE1 = z92.E1(arrayList4);
            }
            if (setE1 != null) {
                Set<ws7.a> set = setE1;
                ArrayList arrayList5 = new ArrayList(t92.r0(set, 10));
                for (ws7.a aVar : set) {
                    aVar.getClass();
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        sjbVar3 = o3h.a;
                    } else if (iOrdinal == 1) {
                        sjbVar3 = o3h.b;
                    } else if (iOrdinal == 2) {
                        sjbVar3 = o3h.c;
                    } else if (iOrdinal == 3) {
                        sjbVar3 = o3h.d;
                    } else {
                        if (iOrdinal != 4) {
                            l.g();
                            return;
                        }
                        sjbVar3 = o3h.e;
                    }
                    arrayList5.add(sjbVar3);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            if (arguments == null || !arguments.containsKey("KEY_SHIFTS_SET") || (stringArray2 = arguments.getStringArray("KEY_SHIFTS_SET")) == null) {
                setE12 = null;
            } else {
                ArrayList arrayList6 = new ArrayList();
                for (String str2 : stringArray2) {
                    str2.getClass();
                    ws7.c cVarValueOf = ws7.c.valueOf(str2);
                    if (cVarValueOf != null) {
                        arrayList6.add(cVarValueOf);
                    }
                }
                setE12 = z92.E1(arrayList6);
            }
            if (setE12 != null) {
                Set<ws7.c> set2 = setE12;
                arrayList2 = new ArrayList(t92.r0(set2, 10));
                for (ws7.c cVar : set2) {
                    cVar.getClass();
                    switch (cVar.ordinal()) {
                        case 0:
                            sjbVar2 = o3h.f;
                            break;
                        case 1:
                            sjbVar2 = o3h.g;
                            break;
                        case 2:
                            sjbVar2 = o3h.h;
                            break;
                        case 3:
                            sjbVar2 = o3h.i;
                            break;
                        case 4:
                            sjbVar2 = o3h.j;
                            break;
                        case 5:
                            sjbVar2 = o3h.k;
                            break;
                        case 6:
                            sjbVar2 = o3h.l;
                            break;
                        case 7:
                            sjbVar2 = o3h.m;
                            break;
                        case 8:
                            sjbVar2 = o3h.n;
                            break;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            sjbVar2 = o3h.o;
                            break;
                        default:
                            l.g();
                            return;
                    }
                    arrayList2.add(sjbVar2);
                }
            } else {
                arrayList2 = null;
            }
            if (arguments == null || !arguments.containsKey("KEY_SCHEDULES_SET") || (stringArray = arguments.getStringArray("KEY_SCHEDULES_SET")) == null) {
                setE13 = null;
            } else {
                ArrayList arrayList7 = new ArrayList();
                for (String str3 : stringArray) {
                    str3.getClass();
                    ws7.b bVarValueOf = ws7.b.valueOf(str3);
                    if (bVarValueOf != null) {
                        arrayList7.add(bVarValueOf);
                    }
                }
                setE13 = z92.E1(arrayList7);
            }
            if (setE13 != null) {
                Set<ws7.b> set3 = setE13;
                arrayList3 = new ArrayList(t92.r0(set3, 10));
                for (ws7.b bVar : set3) {
                    bVar.getClass();
                    int iOrdinal2 = bVar.ordinal();
                    if (iOrdinal2 == 0) {
                        sjbVar = o3h.p;
                    } else if (iOrdinal2 == 1) {
                        sjbVar = o3h.q;
                    } else {
                        if (iOrdinal2 != 2) {
                            l.g();
                            return;
                        }
                        sjbVar = o3h.r;
                    }
                    arrayList3.add(sjbVar);
                }
            }
            if (arrayList != null) {
                aub aubVarQ = Q();
                aubVarQ.v(vsb.a(aubVarQ.l(), null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097119));
            }
            if (arrayList2 != null) {
                aub aubVarQ2 = Q();
                aubVarQ2.v(vsb.a(aubVarQ2.l(), null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097023));
            }
            if (arrayList3 != null) {
                aub aubVarQ3 = Q();
                aubVarQ3.v(vsb.a(aubVarQ3.l(), null, null, null, null, null, null, null, null, null, arrayList3, null, null, null, null, null, null, null, null, null, null, null, 2096639));
            }
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        P(true);
        u63.Y(hh1.A(this), null, null, new i3h(this, null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.h0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.h(pjb.c);
        super.onDestroyView();
    }
}
