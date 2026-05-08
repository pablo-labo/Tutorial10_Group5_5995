package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.b0;
import defpackage.l5;
import defpackage.z92;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001LB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b-\u0010,J \u0010.\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b.\u0010,J \u0010/\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b/\u0010,J \u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b0\u0010,J \u00101\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b1\u0010,J \u00102\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b2\u0010,J(\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b7\u0010\u0005J\u0018\u00108\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b8\u0010\u0005JZ\u0010?\u001a\u00028\u0000\"\u000e\b\u0000\u0010:\u0018\u0001*\u0006\u0012\u0002\b\u0003092\u0006\u0010\r\u001a\u00020\f2\u001a\b\u0004\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020;2\u0014\b\u0004\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000=H\u0082\b¢\u0006\u0004\b?\u0010@J\u001d\u0010C\u001a\u00020\u00002\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0AH\u0002¢\u0006\u0004\bC\u0010DR&\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00000E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0011\u0010K\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "<init>", "(J)V", "pointer", "Lj6g;", "cppDelete", "pollChanges$kotlin_release", "()V", "pollChanges", "", "path", "Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "getNumberProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelNumberProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelStringProperty;", "getStringProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelStringProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "getBooleanProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "getColorProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelColorProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "getEnumProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelEnumProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "getTriggerProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "getInstanceProperty", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "instance", "setInstanceProperty", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "transfer", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "cppPointer", "cppName", "(J)Ljava/lang/String;", "cppPropertyNumber", "(JLjava/lang/String;)J", "cppPropertyString", "cppPropertyBoolean", "cppPropertyColor", "cppPropertyEnum", "cppPropertyTrigger", "cppPropertyInstance", "instancePointer", "", "cppSetInstanceProperty", "(JLjava/lang/String;J)Z", "cppRefInstance", "cppDerefInstance", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "T", "Lkotlin/Function2;", "cppGetPropertyFn", "Lkotlin/Function1;", "constructor", "getProperty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "parts", "traverse", "(Ljava/util/List;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "", "properties", "Ljava/util/Map;", "children", "getName", "()Ljava/lang/String;", "name", "Transfer", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class ViewModelInstance extends NativeObject {
    public static final int $stable = 8;
    private Map<String, ViewModelInstance> children;
    private Map<String, ViewModelProperty<?>> properties;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "instance", "<init>", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "Lj6g;", "dispose", "()V", "end$kotlin_release", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "end", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "", "valid", "Z", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Transfer {
        public static final int $stable = 8;
        private final ViewModelInstance instance;
        private boolean valid;

        public Transfer(ViewModelInstance viewModelInstance) throws ViewModelException {
            viewModelInstance.getClass();
            this.instance = viewModelInstance;
            this.valid = true;
            if (viewModelInstance.getRefCount() <= 0) {
                throw new ViewModelException("Cannot transfer a disposed ViewModelInstance.");
            }
            viewModelInstance.cppRefInstance(viewModelInstance.getCppPointer());
            viewModelInstance.acquire();
        }

        public final void dispose() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                this.instance.release();
            } else {
                throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot dispose.");
            }
        }

        public final ViewModelInstance end$kotlin_release() {
            if (this.valid) {
                this.valid = false;
                return this.instance;
            }
            throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot end transfer again.");
        }
    }

    public ViewModelInstance(long j) {
        super(j);
        this.properties = new LinkedHashMap();
        this.children = new LinkedHashMap();
        cppRefInstance(getCppPointer());
    }

    private final native void cppDerefInstance(long cppPointer);

    private final native String cppName(long cppPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyBoolean(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyColor(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyEnum(long cppPointer, String path);

    private final native long cppPropertyInstance(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyNumber(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyString(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyTrigger(long cppPointer, String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppRefInstance(long cppPointer);

    private final native boolean cppSetInstanceProperty(long cppPointer, String path, long instancePointer);

    private final <T extends ViewModelProperty<?>> T getProperty(String path, Function2<? super Long, ? super String, Long> cppGetPropertyFn, Function1<? super Long, ? extends T> constructor) throws ViewModelException {
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        if (viewModelInstanceTraverse.properties.get(str) != null) {
            b0.u("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
            return null;
        }
        long jLongValue = cppGetPropertyFn.invoke(Long.valueOf(viewModelInstanceTraverse.getCppPointer()), str).longValue();
        if (jLongValue == 0) {
            throw new ViewModelException("Property not found: ".concat(path));
        }
        T tInvoke = constructor.invoke(Long.valueOf(jLongValue));
        viewModelInstanceTraverse.properties.put(str, tInvoke);
        getDependencies().add(tInvoke);
        return tInvoke;
    }

    private final ViewModelInstance traverse(List<String> parts) throws ViewModelException {
        if (parts.isEmpty()) {
            return this;
        }
        String str = (String) z92.O0(parts);
        Map<String, ViewModelInstance> map = this.children;
        ViewModelInstance viewModelInstanceTraverse$createChildInstance = map.get(str);
        if (viewModelInstanceTraverse$createChildInstance == null) {
            viewModelInstanceTraverse$createChildInstance = traverse$createChildInstance(this, str);
            map.put(str, viewModelInstanceTraverse$createChildInstance);
        }
        return viewModelInstanceTraverse$createChildInstance.traverse(parts.subList(1, parts.size()));
    }

    private static final ViewModelInstance traverse$createChildInstance(ViewModelInstance viewModelInstance, String str) throws ViewModelException {
        long jCppPropertyInstance = viewModelInstance.cppPropertyInstance(viewModelInstance.getCppPointer(), str);
        if (jCppPropertyInstance == 0) {
            throw new ViewModelException(l5.l("Property not found: ", str));
        }
        ViewModelInstance viewModelInstance2 = new ViewModelInstance(jCppPropertyInstance);
        viewModelInstance.children.put(str, viewModelInstance2);
        viewModelInstance.getDependencies().add(viewModelInstance2);
        return viewModelInstance2;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long pointer) {
        cppDerefInstance(pointer);
    }

    public final ViewModelBooleanProperty getBooleanProperty(String path) throws ViewModelException {
        path.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyBoolean = cppPropertyBoolean(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyBoolean == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelBooleanProperty viewModelBooleanProperty = new ViewModelBooleanProperty(jCppPropertyBoolean);
            viewModelInstanceTraverse.properties.put(str, viewModelBooleanProperty);
            getDependencies().add(viewModelBooleanProperty);
            viewModelProperty = viewModelBooleanProperty;
        } else if (!(viewModelProperty instanceof ViewModelBooleanProperty)) {
            throw new ViewModelException(l5.m("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelBooleanProperty) viewModelProperty;
    }

    public final ViewModelColorProperty getColorProperty(String path) throws ViewModelException {
        path.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyColor = cppPropertyColor(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyColor == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelColorProperty viewModelColorProperty = new ViewModelColorProperty(jCppPropertyColor);
            viewModelInstanceTraverse.properties.put(str, viewModelColorProperty);
            getDependencies().add(viewModelColorProperty);
            viewModelProperty = viewModelColorProperty;
        } else if (!(viewModelProperty instanceof ViewModelColorProperty)) {
            throw new ViewModelException(l5.m("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelColorProperty) viewModelProperty;
    }

    public final ViewModelEnumProperty getEnumProperty(String path) throws ViewModelException {
        path.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyEnum = cppPropertyEnum(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyEnum == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelEnumProperty viewModelEnumProperty = new ViewModelEnumProperty(jCppPropertyEnum);
            viewModelInstanceTraverse.properties.put(str, viewModelEnumProperty);
            getDependencies().add(viewModelEnumProperty);
            viewModelProperty = viewModelEnumProperty;
        } else if (!(viewModelProperty instanceof ViewModelEnumProperty)) {
            throw new ViewModelException(l5.m("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelEnumProperty) viewModelProperty;
    }

    public final ViewModelInstance getInstanceProperty(String path) {
        path.getClass();
        return traverse(zve.k0(path, new String[]{"/"}));
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final ViewModelNumberProperty getNumberProperty(String path) throws ViewModelException {
        path.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyNumber = cppPropertyNumber(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyNumber == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelNumberProperty viewModelNumberProperty = new ViewModelNumberProperty(jCppPropertyNumber);
            viewModelInstanceTraverse.properties.put(str, viewModelNumberProperty);
            getDependencies().add(viewModelNumberProperty);
            viewModelProperty = viewModelNumberProperty;
        } else if (!(viewModelProperty instanceof ViewModelNumberProperty)) {
            throw new ViewModelException(l5.m("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelNumberProperty) viewModelProperty;
    }

    public final ViewModelStringProperty getStringProperty(String path) throws ViewModelException {
        path.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyString = cppPropertyString(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyString == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelStringProperty viewModelStringProperty = new ViewModelStringProperty(jCppPropertyString);
            viewModelInstanceTraverse.properties.put(str, viewModelStringProperty);
            getDependencies().add(viewModelStringProperty);
            viewModelProperty = viewModelStringProperty;
        } else if (!(viewModelProperty instanceof ViewModelStringProperty)) {
            throw new ViewModelException(l5.m("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelStringProperty) viewModelProperty;
    }

    public final ViewModelTriggerProperty getTriggerProperty(String path) throws ViewModelException {
        path.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ViewModelProperty<?> viewModelProperty = viewModelInstanceTraverse.properties.get(str);
        if (viewModelProperty == null) {
            long jCppPropertyTrigger = cppPropertyTrigger(viewModelInstanceTraverse.getCppPointer(), str);
            if (jCppPropertyTrigger == 0) {
                throw new ViewModelException("Property not found: ".concat(path));
            }
            ViewModelTriggerProperty viewModelTriggerProperty = new ViewModelTriggerProperty(jCppPropertyTrigger);
            viewModelInstanceTraverse.properties.put(str, viewModelTriggerProperty);
            getDependencies().add(viewModelTriggerProperty);
            viewModelProperty = viewModelTriggerProperty;
        } else if (!(viewModelProperty instanceof ViewModelTriggerProperty)) {
            throw new ViewModelException(l5.m("Property '", str, "' exists but is not of the expected type."));
        }
        return (ViewModelTriggerProperty) viewModelProperty;
    }

    public final void pollChanges$kotlin_release() {
        Collection<ViewModelProperty<?>> collectionValues = this.properties.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((ViewModelProperty) obj).isSubscribed$kotlin_release()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ViewModelProperty) it.next()).pollChanges$kotlin_release();
        }
        Iterator<T> it2 = this.children.values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).pollChanges$kotlin_release();
        }
    }

    public final void setInstanceProperty(String path, ViewModelInstance instance) throws ViewModelException {
        path.getClass();
        instance.getClass();
        List listK0 = zve.k0(path, new String[]{"/"});
        List<String> listSubList = listK0.subList(0, listK0.size() - 1);
        String str = (String) z92.Y0(listK0);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        if (!cppSetInstanceProperty(viewModelInstanceTraverse.getCppPointer(), str, instance.getCppPointer())) {
            throw new ViewModelException(l5.m("Property not found: ", path, "; or instance is incompatible."));
        }
        viewModelInstanceTraverse.children.put(str, instance);
    }

    public final Transfer transfer() {
        return new Transfer(this);
    }
}
