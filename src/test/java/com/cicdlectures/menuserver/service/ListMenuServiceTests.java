public class ListMenuServiceTests {

    private ListMenuService subject;
  
    @BeforeEach
    public void init() {
      subject = new ListMenuService(null);
    }
  
    @Test
    @DisplayName("lists all known menus")
    public void listsKnownMenus() {
       List<MenuDto> got = subject.listMenus();
    }
  }
