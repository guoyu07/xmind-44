BeanFactory
ApplicationContext

ClassPathXmlApplicationContext
FileSystemXmlApplicationContext

<beans>
<bean/>
</beans>

@Configuration
@Bean

Instantiating a container

ApplicationContext context =
new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});

PetStoreService service = context.getBean("petStore", PetStoreService.class);