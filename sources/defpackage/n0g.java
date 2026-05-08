package defpackage;

import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class n0g {
    public static final LinkedHashMap a(wqg wqgVar) {
        wqgVar.getClass();
        return lc9.c0(m0g.c, lc9.a0(new Pair("ViewManagerNames", new ArrayList(wqgVar.a())), new Pair("LazyViewManagersEnabled", Boolean.TRUE)));
    }

    public static final LinkedHashMap b(List list, Map map, Map map2) {
        list.getClass();
        LinkedHashMap linkedHashMapI0 = lc9.i0(m0g.c);
        Map<String, Object> map3 = m0g.a;
        Map<String, Object> map4 = m0g.b;
        if (map != null) {
            map.putAll(map3);
        }
        if (map2 != null) {
            map2.putAll(map4);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            name.getClass();
            LinkedHashMap linkedHashMapC = c(viewManager, map, map2);
            if (!linkedHashMapC.isEmpty()) {
                linkedHashMapI0.put(name, linkedHashMapC);
            }
        }
        linkedHashMapI0.put("genericBubblingEventTypes", map3);
        linkedHashMapI0.put("genericDirectEventTypes", map4);
        return linkedHashMapI0;
    }

    public static final LinkedHashMap c(ViewManager viewManager, Map map, Map map2) {
        qmc qmcVar = ie7.g0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (qmcVar.enableFabricRenderer() && qmcVar.useFabricInterop()) {
                exportedCustomBubblingEventTypeConstants = d(exportedCustomBubblingEventTypeConstants);
            }
            e(map, exportedCustomBubblingEventTypeConstants);
            e(exportedCustomBubblingEventTypeConstants, null);
            linkedHashMap.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        viewManager.getName().getClass();
        if (exportedCustomDirectEventTypeConstants != null) {
            if (qmcVar.enableFabricRenderer() && qmcVar.useFabricInterop()) {
                exportedCustomDirectEventTypeConstants = d(exportedCustomDirectEventTypeConstants);
            }
            e(map2, exportedCustomDirectEventTypeConstants);
            e(exportedCustomDirectEventTypeConstants, null);
            linkedHashMap.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            linkedHashMap.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            linkedHashMap.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            linkedHashMap.put("NativeProps", nativeProps);
        }
        return linkedHashMap;
    }

    public static Map d(Map map) {
        String strConcat;
        HashSet<String> hashSet = new HashSet();
        for (String str : map.keySet()) {
            if (!wve.K(str, "top", false)) {
                hashSet.add(str);
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        for (String str2 : hashSet) {
            Object obj = map.get(str2);
            if (obj == null) {
                r6.g("Required value was null.");
                return null;
            }
            if (wve.K(str2, "on", false)) {
                strConcat = str2.substring(2);
            } else {
                String strSubstring = str2.substring(0, 1);
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = strSubstring.toUpperCase(locale);
                upperCase.getClass();
                strConcat = upperCase.concat(str2.substring(1));
            }
            map.put("top".concat(strConcat), obj);
        }
        return map;
    }

    public static void e(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Object obj = map.get(str);
            if (obj != null && pxf.f(value) && pxf.f(obj)) {
                if (!(obj instanceof HashMap)) {
                    HashMap map3 = new HashMap((Map) obj);
                    map.replace(str, pxf.b(map3));
                    obj = map3;
                }
                Map mapB = pxf.b(obj);
                value.getClass();
                e(mapB, pxf.b(value));
            } else {
                map.put(str, value);
            }
        }
    }
}
