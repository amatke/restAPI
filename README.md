# restAPI
Rest API (Server_ project for existing Rest template(client) project

Some path of APIs:

http://localhost:8090

http://localhost:8090/admin/pages                                   -> @GetMapping all pages

http://localhost:8090/admin/pages/{slug}                            -> @GetMapping for Page by slug (home, about-us, contact, ... )

http://localhost:8090/admin/pages                                   -> @PostMapping for Page

http://localhost:8090/admin/pages/edit/{id}                         -> @GetMapping for Page

http://localhost:8090/admin/pages/edit  (@RequestBody Page page)    -> @PutMapping for Page

http://localhost:8090/admin/pages/delete/{id}                         -> @DeleteMapping for Page
