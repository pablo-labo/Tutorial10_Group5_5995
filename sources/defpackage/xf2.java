package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.ald;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf2 implements ald.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // ald.b
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.i0;
                Bundle bundle = new Bundle();
                ComponentActivity.e eVar = ((ComponentActivity) obj).X;
                eVar.getClass();
                LinkedHashMap linkedHashMap = eVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(eVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(eVar.g));
                return bundle;
            default:
                Map<String, List<Object>> mapE = ((jkd) obj).e();
                Bundle bundle2 = new Bundle();
                for (Map.Entry<String, List<Object>> entry : mapE.entrySet()) {
                    String key = entry.getKey();
                    List<Object> value = entry.getValue();
                    bundle2.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                }
                return bundle2;
        }
    }
}
