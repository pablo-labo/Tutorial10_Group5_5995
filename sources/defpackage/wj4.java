package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.bn7;
import defpackage.kv8;
import defpackage.lx5;
import defpackage.v94;
import defpackage.x7d;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wj4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wj4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [wm7, yv8] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Locale locale = (Locale) obj;
                locale.getClass();
                ((g4a) obj2).setValue(locale);
                ((iba) obj3).r();
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("entityData", (String) obj3);
                bVar.a("jobKey", ((SavedJobsDto) obj2).getJobkey());
                break;
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                bVar2.a("subTabName", "Invitations");
                if (str != null) {
                    bVar2.a("entityId", str);
                }
                if (str2 != null) {
                    bVar2.a("jobKey", str2);
                }
                break;
            case 3:
                zv8 zv8Var = (zv8) obj3;
                final bn7 bn7Var = (bn7) obj2;
                ((m74) obj).getClass();
                ?? r6 = new uv8() { // from class: wm7
                    @Override // defpackage.uv8
                    public final void G(zv8 zv8Var2, kv8.a aVar) {
                        if (aVar == kv8.a.ON_RESUME) {
                            bn7Var.n(bn7.a.c.a);
                        }
                    }
                };
                zv8Var.getLifecycle().a(r6);
                break;
            case 4:
                lx5.b bVar3 = (lx5.b) obj;
                bVar3.getClass();
                bVar3.a("elementName", ((pgd) obj3).a.toString());
                bVar3.a("source", (String) obj2);
                break;
            case 5:
                break;
            case 6:
                d9d d9dVar = (d9d) obj2;
                th7 th7Var = (th7) obj;
                if (((x7d) obj3) instanceof x7d.c) {
                    d9dVar.F().i(th7Var.a);
                }
                break;
            default:
                afa afaVar = (afa) obj3;
                long j = ((v94.b) obj).a;
                afaVar.b(1, ((xsd) obj2).d == dwa.b ? ooa.a(j, 1, 0.0f) : ooa.a(j, 2, 0.0f));
                break;
        }
        return j6g.a;
    }
}
