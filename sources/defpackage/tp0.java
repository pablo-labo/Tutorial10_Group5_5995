package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tp0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [T, java.util.Set] */
    @Override // defpackage.gu5
    public final Object invoke() throws Throwable {
        Set<String> setB;
        gtc gtcVar;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                u63.Y((e13) obj4, null, null, new cr0((e8a) obj3, (SavedJobsDto) obj2, (ude) obj, null), 3);
                break;
            default:
                zpe zpeVar = (zpe) obj4;
                luc lucVar = (luc) obj2;
                Long l = (Long) obj;
                Collection<gtc> collection = (Collection) obj3;
                ArrayList arrayList = new ArrayList(t92.r0(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gtc) it.next()).a);
                }
                ArrayList arrayListI = zpeVar.I(arrayList);
                i62 i62Var = zpeVar.d;
                int iV = kc9.V(t92.r0(arrayListI, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                for (Object obj5 : arrayListI) {
                    linkedHashMap.put(((gtc) obj5).a, obj5);
                }
                ArrayList arrayList2 = new ArrayList();
                for (gtc gtcVar2 : collection) {
                    gtc gtcVar3 = (gtc) linkedHashMap.get(gtcVar2.a);
                    if (gtcVar3 == null) {
                        if (l == null) {
                            gtcVar = gtcVar2;
                        } else {
                            String str = gtcVar2.a;
                            Map<String, Object> map = gtcVar2.b;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(map.size()));
                            Iterator<T> it2 = map.entrySet().iterator();
                            while (it2.hasNext()) {
                                linkedHashMap2.put(((Map.Entry) it2.next()).getKey(), l);
                            }
                            gtcVar = new gtc(str, map, linkedHashMap2);
                        }
                        lb8 lb8Var = (lb8) i62Var.a;
                        String str2 = gtcVar.a;
                        String strB = ob8.b(gtcVar);
                        str2.getClass();
                        lb8Var.a.a0(-1927383395, "INSERT INTO records (key, record) VALUES (?,?)", new kb8(0, str2, strB));
                        lb8Var.a(new zg(6), -1927383395);
                        setB = gtcVar2.a();
                    } else {
                        Pair<gtc, Set<String>> pairB = gtcVar3.b(gtcVar2, l);
                        gtc gtcVarA = pairB.a();
                        setB = pairB.b();
                        if (!gtcVarA.b.isEmpty()) {
                            i62Var.getClass();
                            lb8 lb8Var2 = (lb8) i62Var.a;
                            String strB2 = ob8.b(gtcVarA);
                            String str3 = gtcVarA.a;
                            str3.getClass();
                            lb8Var2.a.a0(-1582437203, "UPDATE records SET record=? WHERE key=?", new nz4(strB2, str3, 2));
                            lb8Var2.a(new iq0(8), -1582437203);
                        }
                    }
                    w92.w0(arrayList2, setB);
                }
                lucVar.element = z92.E1(arrayList2);
                break;
        }
        return j6g.a;
    }
}
