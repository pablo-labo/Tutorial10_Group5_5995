package expo.modules.kotlin.jni;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/kotlin/jni/JNIUtils;", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JNIUtils {
    public static final native void emitEvent(JavaScriptModuleObject javaScriptModuleObject, JSIContext jSIContext, String str, Map<String, ? extends Object> map);

    public static final native void emitEvent(JavaScriptObject javaScriptObject, JSIContext jSIContext, String str, Object[] objArr);

    public static final native void emitEvent(JavaScriptWeakObject javaScriptWeakObject, JSIContext jSIContext, String str, Object[] objArr);
}
