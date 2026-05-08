package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;
import defpackage.l5;
import defpackage.q6;
import defpackage.wl7;
import defpackage.z3;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\fJ;\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J/\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\nH\u0002¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014¨\u0006 "}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils;", "", "<init>", "()V", "getMethodDescriptorsFromModule", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "getMethodsFromModule", "", "Ljava/lang/reflect/Method;", "(Lcom/facebook/react/bridge/NativeModule;)[Ljava/lang/reflect/Method;", "createJniSignature", "", "moduleName", "methodName", "paramClasses", "Ljava/lang/Class;", "returnClass", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;", "convertParamClassToJniType", "paramClass", "convertReturnClassToJniType", "convertClassToJniType", "cls", "getJsArgCount", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)I", "createJSIReturnKind", "MethodDescriptor", "ParsingException", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurboModuleInteropUtils {
    public static final TurboModuleInteropUtils INSTANCE = new TurboModuleInteropUtils();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "", "methodName", "", "jniSignature", "jsiReturnKind", "jsArgCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MethodDescriptor {

        @f84
        public final String jniSignature;

        @f84
        public final int jsArgCount;

        @f84
        public final String jsiReturnKind;

        @f84
        public final String methodName;

        public MethodDescriptor(String str, String str2, String str3, int i) {
            q6.m(str, str2, str3);
            this.methodName = str;
            this.jniSignature = str2;
            this.jsiReturnKind = str3;
            this.jsArgCount = i;
        }
    }

    private TurboModuleInteropUtils() {
    }

    private final String convertClassToJniType(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            l5.q("Class must have a canonical name");
            return null;
        }
        String strReplace = canonicalName.replace(JwtParser.SEPARATOR_CHAR, '/');
        strReplace.getClass();
        return "L" + strReplace + ";";
    }

    private final String convertParamClassToJniType(String moduleName, String methodName, Class<?> paramClass) {
        if (wl7.b(paramClass, Boolean.TYPE)) {
            return "Z";
        }
        if (wl7.b(paramClass, Integer.TYPE)) {
            return "I";
        }
        if (wl7.b(paramClass, Double.TYPE)) {
            return "D";
        }
        if (wl7.b(paramClass, Float.TYPE)) {
            return "F";
        }
        if (wl7.b(paramClass, Boolean.class) || wl7.b(paramClass, Integer.class) || wl7.b(paramClass, Double.class) || wl7.b(paramClass, Float.class) || wl7.b(paramClass, String.class) || wl7.b(paramClass, Callback.class) || wl7.b(paramClass, Promise.class) || wl7.b(paramClass, ReadableMap.class) || wl7.b(paramClass, ReadableArray.class) || wl7.b(paramClass, Dynamic.class)) {
            return convertClassToJniType(paramClass);
        }
        throw new ParsingException(moduleName, methodName, l5.l("Unable to parse JNI signature. Detected unsupported parameter class: ", paramClass.getCanonicalName()));
    }

    private final String convertReturnClassToJniType(String moduleName, String methodName, Class<?> returnClass) {
        if (wl7.b(returnClass, Boolean.TYPE)) {
            return "Z";
        }
        if (wl7.b(returnClass, Integer.TYPE)) {
            return "I";
        }
        if (wl7.b(returnClass, Double.TYPE)) {
            return "D";
        }
        if (wl7.b(returnClass, Float.TYPE)) {
            return "F";
        }
        if (wl7.b(returnClass, Void.TYPE)) {
            return "V";
        }
        if (wl7.b(returnClass, Boolean.class) || wl7.b(returnClass, Integer.class) || wl7.b(returnClass, Double.class) || wl7.b(returnClass, Float.class) || wl7.b(returnClass, String.class) || wl7.b(returnClass, WritableMap.class) || wl7.b(returnClass, WritableArray.class) || wl7.b(returnClass, Map.class)) {
            return convertClassToJniType(returnClass);
        }
        throw new ParsingException(moduleName, methodName, l5.l("Unable to parse JNI signature. Detected unsupported return class: ", returnClass.getCanonicalName()));
    }

    private final String createJSIReturnKind(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        for (int i = 0; i < paramClasses.length; i++) {
            if (wl7.b(paramClasses[i], Promise.class)) {
                if (i == paramClasses.length - 1) {
                    return "PromiseKind";
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
            }
        }
        if (wl7.b(returnClass, Boolean.TYPE) || wl7.b(returnClass, Boolean.class)) {
            return "BooleanKind";
        }
        if (wl7.b(returnClass, Double.TYPE) || wl7.b(returnClass, Double.class) || wl7.b(returnClass, Float.TYPE) || wl7.b(returnClass, Float.class) || wl7.b(returnClass, Integer.TYPE) || wl7.b(returnClass, Integer.class)) {
            return "NumberKind";
        }
        if (wl7.b(returnClass, String.class)) {
            return "StringKind";
        }
        if (wl7.b(returnClass, Void.TYPE)) {
            return "VoidKind";
        }
        if (wl7.b(returnClass, WritableMap.class) || wl7.b(returnClass, Map.class)) {
            return "ObjectKind";
        }
        if (wl7.b(returnClass, WritableArray.class)) {
            return "ArrayKind";
        }
        throw new ParsingException(moduleName, methodName, l5.l("Unable to parse JSI return kind. Detected unsupported return class: ", returnClass.getCanonicalName()));
    }

    private final String createJniSignature(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        StringBuilder sb = new StringBuilder("(");
        for (Class<?> cls : paramClasses) {
            sb.append(convertParamClassToJniType(moduleName, methodName, cls));
        }
        sb.append(")");
        sb.append(convertReturnClassToJniType(moduleName, methodName, returnClass));
        return sb.toString();
    }

    private final int getJsArgCount(String moduleName, String methodName, Class<?>[] paramClasses) {
        for (int i = 0; i < paramClasses.length; i++) {
            if (wl7.b(paramClasses[i], Promise.class)) {
                if (i == paramClasses.length - 1) {
                    return paramClasses.length - 1;
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
            }
        }
        return paramClasses.length;
    }

    public static final List<MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
        module.getClass();
        Method[] methodsFromModule = INSTANCE.getMethodsFromModule(module);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Method method : methodsFromModule) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            String name = module.getName();
            name.getClass();
            String name2 = method.getName();
            if (reactMethod != null || "getConstants".equals(name2)) {
                if (hashSet.contains(name2)) {
                    throw new ParsingException(name, l5.l("Module exports two methods to JavaScript with the same name: \"", name2));
                }
                name2.getClass();
                hashSet.add(name2);
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if ("getConstants".equals(name2)) {
                    if (!wl7.b(returnType, Map.class)) {
                        throw new ParsingException(name, "getConstants must return a Map");
                    }
                } else if (reactMethod != null) {
                    boolean zIsBlockingSynchronousMethod = reactMethod.isBlockingSynchronousMethod();
                    Class cls = Void.TYPE;
                    if ((zIsBlockingSynchronousMethod && wl7.b(returnType, cls)) || (!reactMethod.isBlockingSynchronousMethod() && !wl7.b(returnType, cls))) {
                        throw new ParsingException(name, "TurboModule system assumes returnType == void iff the method is synchronous.");
                    }
                }
                TurboModuleInteropUtils turboModuleInteropUtils = INSTANCE;
                parameterTypes.getClass();
                returnType.getClass();
                arrayList.add(new MethodDescriptor(name2, turboModuleInteropUtils.createJniSignature(name, name2, parameterTypes, returnType), turboModuleInteropUtils.createJSIReturnKind(name, name2, parameterTypes, returnType), turboModuleInteropUtils.getJsArgCount(name, name2, parameterTypes)));
            }
        }
        return arrayList;
    }

    private final Method[] getMethodsFromModule(NativeModule module) {
        Class<?> cls = module.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            superclass = null;
        }
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        return declaredMethods;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "moduleName", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "methodName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParsingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(String str, String str2) {
            super("Unable to parse @ReactMethod annotations from native module: " + str + ". Details: " + str2);
            str.getClass();
            str2.getClass();
        }

        public ParsingException(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            StringBuilder sb = new StringBuilder("Unable to parse @ReactMethod annotation from native module method: ");
            sb.append(str);
            super(z3.n(sb, ".", str2, "(). Details: ", str3));
        }
    }
}
