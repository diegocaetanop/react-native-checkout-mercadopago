package com.line64.reactnative.checkoutmercadopago;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.line64.reactnative.checkoutmercadopago.CheckoutMercadoPagoModule;

public class CheckoutMercadoPagoPackage implements ReactPackage {

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

    List<NativeModule> modules = new ArrayList<>();

    modules.add(new CheckoutMercadoPagoModule(reactContext));

    return modules;

  }

}
