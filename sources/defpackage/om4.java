package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.locationselector.LocationSelectorFragment;
import com.indeed.android.messaging.data.events.EventRecord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class om4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ om4(x1e x1eVar, gu5 gu5Var, g4a g4aVar) {
        this.a = 3;
        this.b = x1eVar;
        this.d = gu5Var;
        this.c = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        boolean z = true;
        boolean z2 = false;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                zie zieVar = (zie) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                zieVar.getClass();
                ((Function2) obj5).invoke(zieVar, bool);
                qm4.b(in4.a, "Edit");
                ((g4a) obj3).setValue(null);
                ((g4a) obj4).setValue("");
                break;
            case 1:
                svb svbVar = (svb) obj5;
                Function1 function1 = (Function1) obj3;
                Locale locale = (Locale) obj4;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o97 o97Var = (o97) bVar.M(p97.a);
                    for (lu0 lu0Var : svbVar.C) {
                        String str = lu0Var.b;
                        if (str == null || zve.U(str)) {
                            bVar.L(-333022848);
                        } else {
                            bVar.L(-330837627);
                            boolean zK = bVar.K(function1) | bVar.K(lu0Var);
                            Object objV = bVar.v();
                            Object obj6 = objV;
                            if (zK || objV == c0020a) {
                                ry ryVar = new ry(5, function1, lu0Var);
                                bVar.p(ryVar);
                                obj6 = ryVar;
                            }
                            uub.a((gu5) obj6, false, null, null, null, bh2.c(1674751480, new ud6(lu0Var, o97Var, locale), bVar), bVar, 196608, 30);
                        }
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
            case 2:
                LocationSelectorFragment locationSelectorFragment = (LocationSelectorFragment) obj5;
                List list = (List) obj3;
                List list2 = (List) obj4;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = LocationSelectorFragment.f;
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str2 = locationSelectorFragment.E().a;
                    String str3 = locationSelectorFragment.E().b;
                    boolean zX = bVar2.x(locationSelectorFragment);
                    Object objV2 = bVar2.v();
                    if (zX || objV2 == c0020a) {
                        objV2 = new qa(locationSelectorFragment, 15);
                        bVar2.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    boolean zX2 = bVar2.x(locationSelectorFragment);
                    Object objV3 = bVar2.v();
                    if (zX2 || objV3 == c0020a) {
                        objV3 = new wm1(locationSelectorFragment, 10);
                        bVar2.p(objV3);
                    }
                    gu5 gu5Var2 = (gu5) objV3;
                    boolean zX3 = bVar2.x(locationSelectorFragment);
                    Object objV4 = bVar2.v();
                    if (zX3 || objV4 == c0020a) {
                        objV4 = new o19(locationSelectorFragment, z2 ? 1 : 0);
                        bVar2.p(objV4);
                    }
                    b29.a(str2, list, str3, list2, gu5Var, gu5Var2, (wu5) objV4, bVar2, 0, 0);
                } else {
                    bVar2.D();
                }
                break;
            default:
                x1e x1eVar = (x1e) obj5;
                gu5 gu5Var3 = (gu5) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (zve.U(x1eVar.f)) {
                        List<EventRecord.Attachment> list3 = x1eVar.b;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = false;
                        } else {
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                if (((EventRecord.Attachment) it.next()).getStatus() == EventRecord.AttachmentSentStatus.SUCCESS) {
                                }
                            }
                            z = false;
                        }
                    }
                    boolean zX4 = bVar3.x(x1eVar) | bVar3.K(gu5Var3);
                    Object objV5 = bVar3.v();
                    if (zX4 || objV5 == c0020a) {
                        objV5 = new wf4(2, x1eVar, gu5Var3, g4aVar);
                        bVar3.p(objV5);
                    }
                    hp9.g(0, (gu5) objV5, bVar3, z);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ om4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
