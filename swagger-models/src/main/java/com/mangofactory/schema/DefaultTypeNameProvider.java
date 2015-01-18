package com.mangofactory.schema;

import com.mangofactory.schema.plugins.DocumentationType;
import com.mangofactory.schema.plugins.TypeNameProviderPlugin;

public class DefaultTypeNameProvider implements TypeNameProviderPlugin {

  @Override
  public boolean supports(DocumentationType delimiter) {
    return true;
  }

  @Override
  public String nameFor(Class<?> type) {
    return type.getSimpleName();
  }
}
