# Seminario-eng2
Código do seminario sobre "brain class" da matéria engenharia de software 2


**Brain Class**: 
- Refere-se a classes que tendem a acumular uma quantidade excessivade inteligência, geralmente na forma de vários Brain Method.
- Essa desarmonia de design ́e muito parecida com a God Class, pois ambas se referem a classes comple-xas, mas os dois problemas s ̃ao distintos.
- A estratégia de detecção de Brain Class tenta complementar a de God Class, encontrando classes que são excessivamente complexas, mas que não são detectadas como God Class porque não acessam muitos dados de classes satélites ou porque são um pouco mais coesas.
- As principais características dessas classes são: tem mais de um Brain Method e são muito grandes, ou contém apenas um Brain Method, que ́e extremamente grande e complexo; e ́e muito complexa e pouco coesa (LANZA; MARINESCU, 2006);
Expressão: (((A classe tem mais que 1 Brain Method) E LOC >= 197) OU ((A classe tem 1 Brain Method) E LOC >= 394 E WMC >= 94)) E (WMC >= 47 E TCC < 0.5) (LANZA; MARINESCU, 2006);

- Weighted Method Count(Contagem de métodos ponderados) (WMC): A soma da complexidade estática de todos os métodos de uma classe. A métrica CYCLO é usada para quantificar a complexidade do método (LANZA; MARINESCU, 2006);
- Lines of Code (LOC): Número de linhas de código de código de um módulo de software (que no caso desta dissertação vai incluir linhas em branco e comentários)(LANZA; MARINESCU, 2006);
