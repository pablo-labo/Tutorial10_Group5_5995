package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a14 extends qv5 implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a14(Object obj, int i) {
        super(1, obj, v04.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        this.a = i;
        switch (i) {
            case 1:
                super(1, obj, r97.class, "isJsmaJsBridgeAllowed", "isJsmaJsBridgeAllowed(Ljava/lang/String;)Z", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fB;
        switch (this.a) {
            case 0:
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                return ((v04) this.receiver).L0(n8aVar);
            case 1:
                String str = (String) obj;
                str.getClass();
                ((r97) this.receiver).getClass();
                return Boolean.valueOf(r97.r(str));
            default:
                float fFloatValue = ((Number) obj).floatValue();
                g7c g7cVar = (g7c) this.receiver;
                x2a x2aVar = g7cVar.f;
                if (!g7cVar.c()) {
                    cme cmeVar = (cme) x2aVar;
                    float fG = cmeVar.g() + fFloatValue;
                    if (fG < 0.0f) {
                        fG = 0.0f;
                    }
                    float fG2 = fG - cmeVar.g();
                    ((cme) g7cVar.f).q(fG);
                    if (g7cVar.a() <= g7cVar.b()) {
                        fB = g7cVar.a();
                    } else {
                        float fAbs = Math.abs(g7cVar.a() / g7cVar.b()) - 1.0f;
                        f = fAbs >= 0.0f ? fAbs : 0.0f;
                        if (f > 2.0f) {
                            f = 2.0f;
                        }
                        fB = (g7cVar.b() * (f - (((float) Math.pow(f, 2.0d)) / 4.0f))) + g7cVar.b();
                    }
                    ((cme) g7cVar.e).q(fB);
                    f = fG2;
                }
                return Float.valueOf(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a14(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.a = 2;
    }
}
