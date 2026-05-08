package defpackage;

import defpackage.xz3;
import expo.modules.imagepicker.FailedToReadFileException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public class tb8 extends p2 {
    public final JsonObject V;
    public final SerialDescriptor W;
    public int X;
    public boolean Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb8(s98 s98Var, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(s98Var, jsonObject, str);
        s98Var.getClass();
        this.V = jsonObject;
        this.W = serialDescriptor;
    }

    @Override // defpackage.p2, kotlinx.serialization.encoding.Decoder
    public final boolean F() {
        return !this.Y && super.F();
    }

    @Override // defpackage.i7
    public String S(SerialDescriptor serialDescriptor, int i) throws FailedToReadFileException, IOException {
        serialDescriptor.getClass();
        s98 s98Var = this.d;
        wa8.d(s98Var, serialDescriptor);
        String strE = serialDescriptor.e(i);
        if (this.f.f && !o0().a.keySet().contains(strE)) {
            xz3 xz3Var = s98Var.c;
            jp0 jp0Var = new jp0(7, serialDescriptor, s98Var);
            xz3Var.getClass();
            ConcurrentHashMap concurrentHashMap = xz3Var.a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            xz3.a<Map<String, Integer>> aVar = wa8.a;
            Object objInvoke = map != null ? map.get(aVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = jp0Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator<T> it = o0().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    @Override // defpackage.p2, kotlinx.serialization.encoding.Decoder
    public final ul2 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.W;
        if (serialDescriptor != serialDescriptor2) {
            return super.b(serialDescriptor);
        }
        JsonElement jsonElementN0 = n0();
        String a = serialDescriptor2.getA();
        if (jsonElementN0 instanceof JsonObject) {
            String str = this.e;
            return new tb8(this.d, (JsonObject) jsonElementN0, str, serialDescriptor2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        iwc iwcVar = fwc.a;
        sb.append(iwcVar.b(JsonObject.class).r());
        sb.append(", but had ");
        sb.append(iwcVar.b(jsonElementN0.getClass()).r());
        sb.append(" as the serialized body of ");
        sb.append(a);
        sb.append(" at element: ");
        sb.append(f0());
        throw boa.f(-1, sb.toString(), jsonElementN0.toString());
    }

    @Override // defpackage.p2, defpackage.ul2
    public void c(SerialDescriptor serialDescriptor) {
        Set setO;
        serialDescriptor.getClass();
        s98 s98Var = this.d;
        if (wa8.c(s98Var, serialDescriptor) || (serialDescriptor.f() instanceof kfb)) {
            return;
        }
        wa8.d(s98Var, serialDescriptor);
        if (this.f.f) {
            Set setJ = ka2.j(serialDescriptor);
            xz3 xz3Var = s98Var.c;
            xz3Var.getClass();
            Map map = (Map) xz3Var.a.get(serialDescriptor);
            Object obj = map != null ? map.get(wa8.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = is4.a;
            }
            setO = bbe.o(setJ, setKeySet);
        } else {
            setO = ka2.j(serialDescriptor);
        }
        for (String str : o0().a.keySet()) {
            if (!setO.contains(str) && !wl7.b(str, this.e)) {
                StringBuilder sbM = akb.m("Encountered an unknown key '", str, "' at element: ");
                sbM.append(f0());
                sbM.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbM.append((Object) boa.G(o0().toString(), -1));
                throw boa.e(-1, sbM.toString());
            }
        }
    }

    @Override // defpackage.p2
    public JsonElement m0(String str) {
        str.getClass();
        return (JsonElement) lc9.Y(str, o0());
    }

    @Override // defpackage.ul2
    public int p(SerialDescriptor serialDescriptor) throws FailedToReadFileException, IOException {
        serialDescriptor.getClass();
        while (this.X < serialDescriptor.getC()) {
            int i = this.X;
            this.X = i + 1;
            String strS = S(serialDescriptor, i);
            strS.getClass();
            int i2 = this.X - 1;
            this.Y = false;
            if (!o0().containsKey(strS)) {
                boolean z = (this.d.a.c || serialDescriptor.j(i2) || !serialDescriptor.h(i2).b()) ? false : true;
                this.Y = z;
                if (z) {
                }
            }
            this.f.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.p2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public JsonObject o0() {
        return this.V;
    }

    public /* synthetic */ tb8(s98 s98Var, JsonObject jsonObject, String str, int i) {
        this(s98Var, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
