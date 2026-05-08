package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.exoplayer.source.i;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import defpackage.e75;
import defpackage.fid;
import defpackage.y21;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z65 implements e75.e, wq2, fid.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z65(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 1:
                r.d dVar = (r.d) obj2;
                s sVar = ((x) obj3).b.get();
                if (sVar != null && !sVar.k()) {
                    sVar.h(dVar, false);
                    break;
                }
                break;
            default:
                i.a aVar = (i.a) obj3;
                ((i) obj).C(aVar.a, aVar.b, (nj9) obj2);
                break;
        }
    }

    @Override // fid.a
    public Object apply(Object obj) {
        fid fidVar = (fid) this.b;
        v31 v31Var = (v31) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        z21 z21Var = fidVar.d;
        ArrayList arrayListP = fidVar.P(sQLiteDatabase, v31Var, z21Var.c());
        for (jnb jnbVar : jnb.values()) {
            if (jnbVar != v31Var.c) {
                int iC = z21Var.c() - arrayListP.size();
                if (iC <= 0) {
                    break;
                }
                arrayListP.addAll(fidVar.P(sQLiteDatabase, v31Var.d(jnbVar), iC));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListP.size(); i++) {
            sb.append(((p8b) arrayListP.get(i)).b());
            if (i < arrayListP.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new fid.b(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListP.listIterator();
        while (listIterator.hasNext()) {
            p8b p8bVar = (p8b) listIterator.next();
            if (map.containsKey(Long.valueOf(p8bVar.b()))) {
                y21.a aVarI = p8bVar.a().i();
                for (fid.b bVar : (Set) map.get(Long.valueOf(p8bVar.b()))) {
                    aVarI.a(bVar.a, bVar.b);
                }
                listIterator.set(new j31(p8bVar.b(), p8bVar.c(), aVarI.b()));
            }
        }
        return arrayListP;
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        e75 e75Var = (e75) this.b;
        g.f fVar = (g.f) this.c;
        ax5 ax5Var = e75Var.a;
        g gVar = fVar.d;
        ax5Var.getClass();
        return ax5.o(obj, 0, gVar);
    }
}
