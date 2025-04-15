## Configuration aspects

1)  What is necessary to generate Maven site documentation?
To generate a Maven Site Documentation, you need:

pom.xml (Maven project configuration).

Maven Site Plugin (usually included by default).

Create content under src/site (HTML, XML, or Markdown files).

Steps:
Add the plugin in pom.xml (if not already there):
```
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-site-plugin</artifactId>
      <version>3.9.1</version> <!-- Example version -->
    </plugin>
  </plugins>
</build>
```

Create content under src/site (e.g., src/site/markdown/index.md).

Generate the site:
```bash
mvn site
```

2) Which different aspects, configurations, information, etc. are configured in
configured in site.xml or pom.xml?

**pom.xml**: Project and Build Configuration: Dependencies, plugins, repositories, build process, profiles, versions.

**site.xml**: Maven Site Documentation: Configures the structure of the generated site, reports, layout, and content (e.g., Markdown pages).
