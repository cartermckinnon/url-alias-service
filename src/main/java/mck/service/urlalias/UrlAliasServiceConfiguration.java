package mck.service.urlalias;

import io.dropwizard.Configuration;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mck.service.urlalias.storage.UrlAliasStorageFactoryDeserializer;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class UrlAliasServiceConfiguration extends Configuration {
  /** Username-to-password map. */
  private Map<String, String> apiCredentials = new HashMap<>();

  /**
   * Deserializes a {@link UrlAliasStorageFactory}, the type of which is defined at runtime by
   * {@link UrlAliasStorageFactoryDeserializer#getFactoryClass()}.
   */
  private UrlAliasStorageFactoryDeserializer storage = new UrlAliasStorageFactoryDeserializer();
}
